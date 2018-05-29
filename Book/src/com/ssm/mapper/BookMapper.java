/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-10下午2:57:12
 */
package com.ssm.mapper;

import java.util.List;

import com.ssm.pojo.Book;
import com.ssm.pojo.FindAllBook;

/**
 * @ClassName:BookMapper
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-10下午2:57:12
 */
public interface BookMapper {
	public void add(Book book);
	public void delete(String id);
    public List<Book> list();
    public void update(Book book);
    public Book get(String id);
    public List<FindAllBook> listAllBook();
}
