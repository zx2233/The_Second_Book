/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-27下午4:06:37
 */
package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.User_book;
import com.ssm.service.User_bookService;

/**
 * @ClassName:User_BookController
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-27下午4:06:37
 */
@Controller
@RequestMapping("")
public class User_BookController {
	private String message;
	@Autowired
	User_bookService user_BookService;

	/** 
	 * @author:Rabbit
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @author:Rabbit
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
