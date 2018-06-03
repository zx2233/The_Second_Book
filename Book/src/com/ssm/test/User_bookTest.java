package com.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//关于org.springframework.test.context.junit4.SpringJUnit4ClassRunner;无法找到的问题，
//jdk从8换成Sun jdk sun6就可以解决，很迷.然后不管出不出现错误，测试用例都能顺利运行，尴尬。

import com.ssm.mapper.BookMapper;
import com.ssm.mapper.LoginMapper;
import com.ssm.mapper.User_bookMapper;
import com.ssm.pojo.Book;
import com.ssm.pojo.Login;
import com.ssm.pojo.User_book;
import com.ssm.service.BookService;
import com.ssm.service.LoginService;
import com.ssm.service.User_bookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class User_bookTest {
	/******User_book****************/
	@Autowired
	User_bookMapper user_bookMapper;
	@Autowired
	User_bookService user_bookService;
	@Test
	public void List() {
		List<User_book> list=user_bookService.list();
		for (User_book user_book : list) {
			System.out.println(user_book.getAduit_status());
		}
	}
	@Test
	public void publish() {
		User_book user=new User_book();
		user.setBook_Bid("2");
		user.setUser_Uid("1");
		user.setAduit_status("已审核");
		user_bookService.publish(user);
	}
}
