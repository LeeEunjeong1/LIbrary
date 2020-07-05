package com.library.service;

import com.library.vo.BookVO;
import java.util.ArrayList;
import com.library.dao.BookDAO;

public class BookService {
	private static BookService service = new BookService();
	public BookDAO dao = BookDAO.getInstance();
	
	private BookService() {}
	
	public static BookService getInstance() {
		return service;
	}
	
	public void bookInsert(BookVO book) {
		dao.bookInsert(book);
	}
	
	public BookVO bookSearch(String bookname) {
		return dao.bookSearch(bookname);
	}
	
	public ArrayList<BookVO> bookList() {
		return dao.bookList();
	}
}
