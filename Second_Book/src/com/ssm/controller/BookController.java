/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-12下午3:30:25
 */
package com.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
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
 * @ClassName:BookController
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-12下午3:30:25
 */
@Controller
@RequestMapping("")
public class BookController {
	private String message;
	@Autowired
	BookService bookService;
	@Autowired
	User_bookService user_BookService;

	@RequestMapping("listBook")
	public ModelAndView listBook() {
		ModelAndView mav = new ModelAndView();
		List<Book> cs = bookService.list();
		System.out.println(cs.get(0).getBook_Bid());
		mav.addObject("cs", cs);
		mav.setViewName("index.jsp");
		return mav;
	}

	/**
	 * 图书的发布
	 **/
	@RequestMapping("addBook")
	// @ResponseBody
	public ModelAndView addBook(Book c, MultipartFile file,
			HttpServletRequest request) throws IOException {
		ModelAndView mav = new ModelAndView();
		String path = request.getSession().getServletContext()
				.getRealPath("img");
		if(c.getBook_Name()==null||c.getBook_Name().equals("")||
				c.getBook_New_or_Old()==null||c.getBook_New_or_Old().equals("")||
				c.getBook_Number()==null||c.getBook_Number().equals("")||
				c.getBook_Description()==null||c.getBook_Description().equals("")||
				c.getBook_Price()==null||c.getBook_Price().equals("")
				){
			System.out.println("SS");
			message = "发布失败";
		}else {
			if (!file.isEmpty()) {
				int i = (int) (1 + Math.random() * 100000);
				String filename = file.getOriginalFilename();
				String newfilename=String.valueOf(i)+filename;
				File image = new File(path, newfilename);
				if (!image.exists()) {
					image.mkdir();
				}
				file.transferTo(image);
				String id = String.valueOf(i);
				String NowPath = "img" + "\\" + newfilename;
				c.setBook_Bid(id);
				c.setBook_Image(NowPath);
				bookService.add(c);
				/*
				 * 图书的发布默认为待审核状态
				 * Aduit_status,Selling_status,isCollection;0为false，1为true 审核时，应为
				 * 0，0，0.审核成功 1，0，0 否定以上
				 */
				User_book user_book = new User_book("1", id, "未审核", "未发布", "0");
				user_BookService.add(user_book);
				message = "发布成功";
			}else{
				message = "发布失败";
			}	
		}
		mav.addObject("message", message);
		mav.setViewName("Book_Publish.jsp");
		return mav;
	}

	/**
	 * 用户查找全部审核中的书籍
	 **/
	@RequestMapping("findAllBook")
	@ResponseBody
	public List<FindAllBook> findAllBook(Page page) {
		System.out.println("进入findAllBook");
		String id = "1";
		PageHelper.offsetPage(page.getStart(), 6);
		List<FindAllBook> list = bookService.listAllBookUnpublish(id);
		int total = (int) new PageInfo<FindAllBook>(list).getTotal();
		page.caculateLast(total);
		for (FindAllBook findAllBook : list) {
			System.out.println(findAllBook.toString());
		}
		return list;
	}
	@RequestMapping("listAllBookPublish")
	@ResponseBody
	public ModelAndView listAllBookPublish(String condition,Page page) {
		System.out.println("进入listAllBookPublish");
		ModelAndView mav = new ModelAndView();
		String id = "1";
		System.out.println(condition);
		if(condition==null||condition.equals("")){
			mav.setViewName("index.jsp");
			return mav;
		}else{
			
			PageHelper.offsetPage(page.getStart(), 6);
			List<FindAllBook> list = bookService.listAllBookPublish(id, condition);
			int total = (int) new PageInfo<FindAllBook>(list).getTotal();
			page.caculateLast(total);
			mav.addObject("cs", list);
			mav.addObject("condition", condition);
			mav.setViewName("index.jsp");
			return mav;
		}
		
		
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
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
