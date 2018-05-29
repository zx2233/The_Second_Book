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
import com.ssm.pojo.Book;
import com.ssm.pojo.User_book;
import com.ssm.service.BookService;
import com.ssm.service.User_bookService;

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

	@RequestMapping("addBook")
	//@ResponseBody
	public ModelAndView addBook(Book c, MultipartFile file,
			HttpServletRequest request) throws IOException {
		String path = request.getSession().getServletContext()
				.getRealPath("img");
		String filename = file.getOriginalFilename();
		File image = new File(path, filename);
		if (!image.exists()) {
			image.mkdir();
		}
		file.transferTo(image);
		int i = (int) (1 + Math.random() * 100000);
		String id = String.valueOf(i);
		String NowPath = path + "/" + filename;
		c.setBook_Bid(id);
		c.setBook_Image(NowPath);
		bookService.add(c);
		//Aduit_status,Selling_status,isCollection;0为false，1为true
		//审核时，应为 0，0，0.审核成功 1，0，0
		User_book user_book=new User_book("1",id,"0","0","0");
		user_BookService.add(user_book);
		ModelAndView mav = new ModelAndView();
		message = "插入成功";
		mav.addObject("message", message);
		mav.setViewName("Book_Publish.jsp");
		return mav;
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
