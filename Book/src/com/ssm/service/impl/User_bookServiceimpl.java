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

}
