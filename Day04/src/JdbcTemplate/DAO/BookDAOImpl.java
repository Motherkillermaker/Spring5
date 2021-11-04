package JdbcTemplate.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author CJYong
 * @create 2021-08-11 15:42
 */

@Repository
public class BookDAOImpl implements BookDAO{

    //注入 JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加的功能
     * @param book
     */
    @Override
    public void add(Book book) {
        //1 创建 sql 语句
        String sql = "insert into t_book values(?,?,?)";

        //2 调用方法实现
        Object[] args = {book.getId(),book.getName(),book.getAuthor()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    /**
     * 删除功能
     * @param id
     */
    @Override
    public void delete(int id) {
        String sql = "delete from t_book where id = ?";

        int update = jdbcTemplate.update(sql, id);

        System.out.println(update);


    }

    /**
     * 修改功能
     * @param book
     */
    @Override
    public void update(Book book) {
        String sql = "update t_book set name = ? , author = ? where id = ?";

        Object[] args = {book.getName(),book.getAuthor(),book.getId()};
        int update = jdbcTemplate.update(sql, args);

        System.out.println(update);

    }

    /**
     * 查询功能
     */
    @Override
    public int findValue() {
        String sql = "select count(*) from t_book";

        Integer value = jdbcTemplate.queryForObject(sql, Integer.class);

        return value;
    }

    @Override
    public Book queryFoBook(int id) {

        String sql = "select  *  from t_book where id = ?";

        //三个参数：
        // sql语句
        //RowMapper():RowMapper 是接口，针对返回不同类型数据，使用这个接口里面实现类完成数据封装
        // 参数值
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
    }

    @Override
    public List<Book> queryForList() {
        String sql = "select * from t_book";

        List<Book> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));

        return list;
    }

    /**
     * 批量添加
     * @param args
     */
    @Override
    public void batchAddBook(List<Object[]> args) {

        String sql = "insert into t_book values(?,?,?)";
        int[] batchUpdate = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(batchUpdate));

    }

    /**
     * 批量修改
     * @param args
     */
    @Override
    public void batchUpdateBook(List<Object[]> args) {

        String sql = "update t_book set name = ? , author = ? where id = ?";
        int[] batchUpdate = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(batchUpdate);

    }

    @Override
    public void batchDeleteBook(List<Object[]> args) {

        String sql = "delete from t_book where id= ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(ints));

    }


}

