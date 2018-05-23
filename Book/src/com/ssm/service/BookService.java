/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-10下午3:11:40
 */
package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Book;



/**
 * @ClassName:BookService
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-10下午3:11:40
 */
public interface BookService {
	List<Book> list();
	void delete(String id);
	void add(Book c);
     void update(Book book);
     Book get(String id);
}
