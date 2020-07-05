package com.library.service;


import java.util.ArrayList;

import com.library.dao.MemberDAO;
import com.library.service.MemberService;
import com.library.vo.MemberVO;

public class MemberService {
	private static MemberService service = new MemberService();
	public MemberDAO dao = MemberDAO.getInstance();
	
	private MemberService() {}
	
	public static MemberService getInstance() {
		return service;
	}
	
	public void memberJoin(MemberVO member) {
		dao.memberJoin(member);
		
	}
	
	public ArrayList<MemberVO> memberList() {
		return dao.memberList();
	}
	
	public String memberLogin(String id) {
		return dao.memberLogin(id);
	}
	

}
