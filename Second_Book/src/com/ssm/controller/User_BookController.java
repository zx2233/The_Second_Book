/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-27下午4:06:37
 */
package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.pojo.Book;
import com.ssm.pojo.FindAllBook;
import com.ssm.pojo.User_book;
import com.ssm.service.BookService;
import com.ssm.service.User_bookService;
import com.ssm.util.Page;

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
	BookService bookService;
	@Autowired
	User_bookService user_BookService;
	/**
	 * 用户对审核中书籍进行发布
	 * 
	 * */
	@RequestMapping("updateBookAduit")
	@ResponseBody
	public List<FindAllBook> updateBookAduit(User_book user_book,Page page){
		System.out.println("进入updateBookAduit");
		System.out.println(user_book.getBook_Bid());
		user_BookService.publish(user_book);
		PageHelper.offsetPage(page.getStart(), 6);
		List<FindAllBook> list = bookService.listAllBookUnpublish(user_book.getUser_Uid());
		int total = (int) new PageInfo<FindAllBook>(list).getTotal();
		page.caculateLast(total);
		return list;
	}
	/**
	 *查找全部本用户已发布的书籍
	 * 
	 * */
	@RequestMapping("listAllPublishedBook")
	@ResponseBody
	public List<FindAllBook> listAllPublishedBook(Page page){
		System.out.println("进入listAllPublishedBook");
		String id="1";
		PageHelper.offsetPage(page.getStart(), 6);
		List<FindAllBook> list = user_BookService.listAllPublishedBook(id);
		int total = (int) new PageInfo<FindAllBook>(list).getTotal();
		page.caculateLast(total);
		return list;
	}
	/**
	 * 下架已发布的书籍
	 * 
	 * */
	@RequestMapping("Unpublish")
	@ResponseBody
	public List<FindAllBook> Unpublish(User_book user_book,Page page){
		System.out.println("进入Unpublish");
		user_BookService.Unpublish_Delete_User_book(user_book);
		bookService.delete(user_book.getBook_Bid());
		String id="1";
		PageHelper.offsetPage(page.getStart(), 6);
		List<FindAllBook> list = user_BookService.listAllPublishedBook(id);
		int total = (int) new PageInfo<FindAllBook>(list).getTotal();
		page.caculateLast(total);
		return list;
	}
	/**
	 * 查找要修改的书籍信息
	 * 
	 * */
	@RequestMapping("UpdatePublished")
	@ResponseBody
	public FindAllBook UpdatePublished(User_book user_book){
		System.out.println("进入UpdatePublished");
		FindAllBook findAllBook=new FindAllBook();
		findAllBook=user_BookService.SelectPublishedBookBy_Bid_Uid(user_book);
		System.out.println(findAllBook.toString());
		return findAllBook;
	}
	/**
	 * 修改书籍信息
	 * 
	 * */
	@RequestMapping("UpdateBook")
	@ResponseBody
	public List<FindAllBook> UpdateBook(FindAllBook findAllBook,Page page) {
		System.out.println("进入UpdateBook");
		System.out.println(findAllBook.getBook_Number());
		String id = "1";
		Book bok=new Book();
		bok=bookService.get(findAllBook.getBook_Bid());
		bok.setBook_Number(findAllBook.getBook_Number());
		bok.setBook_Price(findAllBook.getBook_Price());
		bookService.update(bok);
		PageHelper.offsetPage(page.getStart(), 6);
		List<FindAllBook> list = user_BookService.listAllPublishedBook(id);
		int total = (int) new PageInfo<FindAllBook>(list).getTotal();
		page.caculateLast(total);
		return list;
	}
	/**
	 * 取消未审核的书籍
	 * 
	 * */
	@RequestMapping("CancelAduit")
	@ResponseBody
	public List<FindAllBook> CancelAduit(User_book user_book,Page page){
		System.out.println("进入CancelAduit");
		user_BookService.CancelAduit(user_book);
		bookService.delete(user_book.getBook_Bid());
		String id="1";
		PageHelper.offsetPage(page.getStart(), 6);
		List<FindAllBook> list = bookService.listAllBookUnpublish(id);
		int total = (int) new PageInfo<FindAllBook>(list).getTotal();
		page.caculateLast(total);
		return list;
	}
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
