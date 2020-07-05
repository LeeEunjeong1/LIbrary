package com.library.controller;

import javax.servlet.http.*;

import java.io.*;
import java.util.HashMap;

import javax.servlet.*;

public class FrontController extends HttpServlet{
	HashMap<String, Controller> list = null;
	public void init(ServletConfig sc) throws ServletException{
		
		list = new HashMap<String, Controller>();
		list.put("/join.do", new JoinController());
		list.put("/login.do", new LoginController());
		list.put("/logout.do", new LogoutController());
		list.put("/bookInsert.do", new BookInsertController());
		list.put("/bookSearch.do", new BookSearchController());
		list.put("/bookList.do", new BookListController());
		
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String url = request.getRequestURI();
		String contextPath = request.getContextPath();
		String path = url.substring(contextPath.length());
		
		Controller subController = list.get(path);
		subController.execute(request, response);
	}

}
