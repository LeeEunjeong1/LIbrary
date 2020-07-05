package com.library.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.controller.HttpUtil;
import com.library.service.BookService;
import com.library.vo.BookVO;

public class BookInsertController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bookname = request.getParameter("bookname");
		String author = request.getParameter("author");
		String bookfield = request.getParameter("bookfield");
		String publisher = request.getParameter("publisher");
		String publishyear = request.getParameter("publishyear");
		
		if(bookname.isEmpty() || author.isEmpty() || bookfield.isEmpty() || publisher.isEmpty()|| publishyear.isEmpty()) {
			request.setAttribute("error","모든 항목을 빠짐없이 입력해주세요.");
			HttpUtil.forward(request, response, "/book_plus.jsp");
			return;
		}
		
		BookService service = BookService.getInstance();
		ArrayList<BookVO> list = service.bookList();
		request.setAttribute("list", list);
		
		BookVO book = new BookVO(bookname, author, bookfield, publisher, publishyear);
		service.bookInsert(book);
		
		request.setAttribute("bookname", bookname);
		HttpUtil.forward(request, response, "/result/bookInsertOutput.jsp");
	}
}
