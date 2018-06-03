/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-17下午3:01:42
 */
package com.ssm.service;

import java.util.List;

import com.ssm.pojo.FindAllBook;
import com.ssm.pojo.User_book;

/**
 * @ClassName:User_bookService
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-17下午3:01:42
 */
public interface User_bookService {
	
	List<User_book> list();
	
	void add(User_book user_book);
	
	void publish(User_book user_book);
	
	List<FindAllBook>  listAllPublishedBook(String id);
	
	void Unpublish_Delete_User_book(User_book user_book);
	
	FindAllBook SelectPublishedBookBy_Bid_Uid(User_book user_book); 
}
