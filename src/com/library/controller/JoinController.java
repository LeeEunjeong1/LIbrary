package com.library.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.controller.HttpUtil;
import com.library.service.MemberService;
import com.library.vo.MemberVO;

public class JoinController implements Controller{
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String birth = request.getParameter("birth");
		
		if(id.isEmpty() || passwd.isEmpty() || name.isEmpty() || email.isEmpty()|| birth.isEmpty()) {
			request.setAttribute("error","모든 항목을 빠짐없이 입력해주세요");
			HttpUtil.forward(request, response, "/join.jsp");
			return;
		}
		MemberService service = MemberService.getInstance();
		ArrayList<MemberVO> list = service.memberList();
		request.setAttribute("list",list);		
		for(int i = 0; i<list.size(); i++){
			MemberVO member = list.get(i);
			if(id.equals(member.getId())) {
				request.setAttribute("error","이미 등록되어있는 아이디 입니다.");
				HttpUtil.forward(request, response, "/join.jsp");
				return;
			}
			
		}
		MemberVO member = new MemberVO(id,passwd,name,email,birth);
		
		service.memberJoin(member);
		
		request.setAttribute("id", id);
		
		HttpUtil.forward(request, response, "/result/joinOutput.jsp");
	}

}
