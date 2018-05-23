/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-12下午3:30:25
 */
package com.ssm.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.Book;
import com.ssm.service.BookService;
/**
 * @ClassName:BookController
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-12下午3:30:25
 */
@Controller
@RequestMapping("")
public class BookController {
	@Autowired
	BookService bookService;
	  @RequestMapping("listBook")
	  public ModelAndView listBook(){
		  ModelAndView mav = new ModelAndView();
		   List<Book> cs= bookService.list();
		   System.out.println(cs.get(0).getBook_Bid());
	        // 放入转发参数
	        mav.addObject("cs", cs);
	        // 放入jsp路径
	        mav.setViewName("index.jsp");
		return mav;  
	  }
}
