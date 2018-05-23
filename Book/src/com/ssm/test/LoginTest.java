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
import com.ssm.service.BookService;
import com.ssm.service.LoginService;
import com.ssm.service.User_bookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class LoginTest {
	/******Login****************/
	@Autowired
	LoginMapper loginMapper;
	@Autowired
	LoginService loginService;
	@Test
	public void List2() {
		List<Login> list=loginService.list();
		for (Login login : list) {
			System.out.println( login.getUser_Lid());
		}
	}
	/******User_book****************/
	@Autowired
	User_bookMapper user_bookMapper;
	@Autowired
	User_bookService user_bookService;
}
