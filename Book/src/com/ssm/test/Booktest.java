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
import com.ssm.pojo.FindAllBook;
import com.ssm.pojo.Login;
import com.ssm.service.BookService;
import com.ssm.service.LoginService;
import com.ssm.service.User_bookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Booktest {
	/********** BOOK **********************/
	@Autowired
	BookMapper bookMapper;
	@Autowired
	BookService bookService;

	@Test
	public void addTest() {
		Book book = new Book();
		book.setBook_Bid("2");
		book.setBook_Description("2");
		book.setBook_Image("2");
		book.setBook_Name("2");
		book.setBook_New_or_Old("2");
		book.setBook_Number("2");
		book.setBook_Price("2");
		book.setBook_Up_Down("2");
		bookService.add(book);
	}

	@Test
	public void test1() {
		List<Book> list = bookService.list();
		for (Book book : list) {
			System.out.println(book.getBook_Bid());
		}
	}

	@Test
	public void delete3() {
		bookService.delete("2");
	}

	@Test
	public void updateBook() {
		Book book = new Book();
		book.setBook_Bid("2");
		book.setBook_Description("3");
		book.setBook_Image("2");
		book.setBook_Name("2");
		book.setBook_New_or_Old("2");
		book.setBook_Number("2");
		book.setBook_Price("2");
		book.setBook_Up_Down("2");
		bookService.update(book);
	}
	@Test
	public void getBook() {
		Book book = bookService.get("2");
		System.out.println(book.getBook_Description());
	}

	@Test
	public void getAllBook() {
		String id="1";
		List<FindAllBook> list = bookService.listAllAuditedBook(id);
		for (FindAllBook findAllBook : list) {
			System.out.println(findAllBook.getBook_Name());
		}
	}
}
