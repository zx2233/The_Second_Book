/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-17下午2:58:35
 */
package com.ssm.mapper;

import java.util.List;

import com.ssm.pojo.FindAllBook;
import com.ssm.pojo.User_book;

/**
 * @ClassName:user_bookMapper
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-17下午2:58:35
 */
public interface User_bookMapper {
	 public List<User_book> list();
	 public void add(User_book user_book);
	 public void publish(User_book user_book);
	 public List<FindAllBook>  listAllPublishedBook(String id);
	 public void Unpublish_Delete_User_book(User_book user_book); 
	 public FindAllBook SelectPublishedBookBy_Bid_Uid(User_book user_book); 
}
