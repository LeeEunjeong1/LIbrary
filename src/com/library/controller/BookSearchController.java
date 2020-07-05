package com.library.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.controller.Controller;
import com.library.controller.HttpUtil;
import com.library.service.BookService;
import com.library.vo.BookVO;

public class BookSearchController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookname = request.getParameter("bookname");
		String job = request.getParameter("job");
		String path = null;
		
		/*if(job.equals("search"))
			path = "/bookSearch.jsp";*/
		/*else if(job.equals("update"))
			path = "/memberUpdate.jsp";
		else if(job.equals("delete"))
			path = "/memberDelete.jsp";*/
		
		
		BookService service = BookService.getInstance();
		BookVO book = service.bookSearch(bookname);

		if(book==null)
			request.setAttribute("result", "�˻��� ������ �����ϴ�.");
		request.setAttribute("book", book);
		
		if(job.equals("search"))
			path = "/result/bookSearchOutput.jsp";
		HttpUtil.forward(request, response, path);
	}
}