/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-17下午3:02:52
 */
package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.User_bookMapper;
import com.ssm.pojo.FindAllBook;
import com.ssm.pojo.User_book;
import com.ssm.service.User_bookService;

/**
 * @ClassName:User_bookServiceimpl
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-17下午3:02:52
 */
@Service
public class User_bookServiceimpl implements User_bookService {
	@Autowired
	User_bookMapper user_bookMapper;
	/* (non-Javadoc)
	 * @see com.ssm.service.User_bookService#list()
	 */
	@Override
	public List<User_book> list() {
		// TODO Auto-generated method stub
		return user_bookMapper.list();
	}
	/* (non-Javadoc)
	 * @see com.ssm.service.User_bookService#add(com.ssm.pojo.User_book)
	 */
	@Override
	public void add(User_book user_book) {
		// TODO Auto-generated method stub
		user_bookMapper.add(user_book);
	}
	/* (non-Javadoc)
	 * @see com.ssm.service.User_bookService#publish(com.ssm.pojo.User_book)
	 */
	@Override
	public void publish(User_book user_book) {
		// TODO Auto-generated method stub
		user_bookMapper.publish(user_book);
	}
	/* (non-Javadoc)
	 * @see com.ssm.service.User_bookService#listAllSellingBook(java.lang.String)
	 */
	@Override
	public List<FindAllBook> listAllPublishedBook(String id) {
		// TODO Auto-generated method stub
		return user_bookMapper.listAllPublishedBook(id);
	}
	/* (non-Javadoc)
	 * @see com.ssm.service.User_bookService#Unpublish(com.ssm.pojo.User_book)
	 */
	@Override
	public void Unpublish_Delete_User_book(User_book user_book) {
		// TODO Auto-generated method stub
		user_bookMapper.Unpublish_Delete_User_book(user_book);
	}
	/* (non-Javadoc)
	 * @see com.ssm.service.User_bookService#SelectPublishedBookBy_Bid_Uid(com.ssm.pojo.User_book)
	 */
	@Override
	public FindAllBook SelectPublishedBookBy_Bid_Uid(User_book user_book) {
		// TODO Auto-generated method stub
		return user_bookMapper.SelectPublishedBookBy_Bid_Uid(user_book);
	}

}
