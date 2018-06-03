/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-10下午3:20:51
 */
package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.BookMapper;
import com.ssm.pojo.Book;
import com.ssm.pojo.FindAllBook;
import com.ssm.service.BookService;

/**
 * @ClassName:BookServiceImpl
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-10下午3:20:51
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookMapper bookMapper;

	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub
		bookMapper.add(book);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ssm.service.BookService#list()
	 */
	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return bookMapper.list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ssm.service.BookService#delete(java.lang.String)
	 */
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		bookMapper.delete(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ssm.service.BookService#get(java.lang.String)
	 */
	@Override
	public Book get(String id) {
		// TODO Auto-generated method stub
		return bookMapper.get(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ssm.service.BookService#update(com.ssm.pojo.Book)
	 */
	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		bookMapper.update(book);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ssm.service.BookService#listAllBook()
	 */
	@Override
	public List<FindAllBook> listAllAuditedBook(String id) {
		// TODO Auto-generated method stub
		return bookMapper.listAllAuditedBook(id);
	}

	/* (non-Javadoc)
	 * @see com.ssm.service.BookService#listAllBookNoAudit(java.lang.String)
	 */
	@Override
	public List<FindAllBook> listAllBookNoAudit(String id) {
		// TODO Auto-generated method stub
		return  bookMapper.listAllBookNoAudit(id);
	}

	/* (non-Javadoc)
	 * @see com.ssm.service.BookService#listAllBook(java.lang.String)
	 */
	@Override
	public List<FindAllBook> listAllBookUnpublish(String id) {
		// TODO Auto-generated method stub
		return bookMapper.listAllBookUnpublish(id);
	}

	
}
