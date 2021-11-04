package JdbcTemplate.service;

import JdbcTemplate.DAO.Book;
import JdbcTemplate.DAO.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CJYong
 * @create 2021-08-11 15:42
 */

@Service
public class BookService {

    //注入 dao
    @Autowired
    private BookDAO bookDAO;

    /**
     * 添加功能
     * @param book
     */
    public void add(Book book){
        bookDAO.add(book);
    }

    /**
     * 删除功能
     * @param id
     */
    public void delete(int id){
        bookDAO.delete(id);
    }

    /**
     * 修改功能
     * @param book
     */
    public void update(Book book){
        bookDAO.update(book);

    }

    /**
     * 查询特殊值
     * @return
     */
    public int findCount(){

         return bookDAO.findValue();

    }

    /**
     * 查询返回一个对象
     * @param id
     * @return
     */
    public Book queryForOne(int id){
        return bookDAO.queryFoBook(id);
    }

    /**
     * 查询返回对象集合
     * @return
     */
    public List<Book> queryForList(){
        return bookDAO.queryForList();
    }

    /**
     * 批量添加操作
     * @param args
     */
    public void batchAdd(List<Object[]> args){

        bookDAO.batchAddBook(args);

    }

    /**
     * 批量修改
     * @param args
     */
    public void batchUpdate(List<Object[]> args){
        bookDAO.batchUpdateBook(args);
    }

    /**
     * 批量删除
     * @param args
     */
    public void batchDelete(List<Object[]> args){
        bookDAO.batchDeleteBook(args);
    }


}

