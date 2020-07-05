package com.library.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.library.service.MemberService;

public class LoginController implements Controller{
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
	
		MemberService service = MemberService.getInstance();
		String dbPasswd = service.memberLogin(id);
		if(id.isEmpty() || passwd.isEmpty()) {
			request.setAttribute("error", "아이디 또는 비밀번호를 입력하세요");
			HttpUtil.forward(request, response, "/login.jsp");
			return;
		}
		if(dbPasswd == null) {
			request.setAttribute("error", "존재하지않는 아이디입니다.");
			HttpUtil.forward(request, response, "/login.jsp");
		}else {
			if(!dbPasswd.equals(passwd)) {
				request.setAttribute("error", "비밀번호가 틀립니다.");
			}else if(dbPasswd.equals(passwd)) {
				HttpSession session = request.getSession();
				session.setAttribute("id",id);
				HttpUtil.forward(request, response, "/main2.jsp");
				return;
			}
			HttpUtil.forward(request, response, "/login.jsp");
		}
		
		
		
	}
	
}
