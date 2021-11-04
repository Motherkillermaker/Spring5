package JdbcTemplate.DAO;

import java.util.List;

/**
 * @author CJYong
 * @create 2021-08-11 15:42
 */
public interface BookDAO {
    //添加方法
    void add(Book book);

    //删除方法
    void delete(int id);

    //修改方法
    void update(Book book);

    //查询方法

    int findValue();

    Book queryFoBook(int id);

    List<Book> queryForList();

    //批量添加
    void batchAddBook(List<Object[]> args);

    //批量修改
    void batchUpdateBook(List<Object[]> args);

    //批量删除
    void batchDeleteBook(List<Object[]> args);
}
