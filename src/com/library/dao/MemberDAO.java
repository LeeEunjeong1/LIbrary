package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.library.vo.MemberVO;


public class MemberDAO {
private static MemberDAO dao = new MemberDAO();
	
	private MemberDAO() {}
	
	public static MemberDAO getInstance() {
		return dao;
	}
	public Connection connect() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/library";
			String user = "root";
			String password = "cs1234";
			conn = DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			System.out.println("Connect ¿À·ù"+e);
		}
		return conn;
	}
	public void close(Connection conn,PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();
			}catch(Exception e){
				System.out.println("Error:close"+e);
			}
		}
		if(conn != null) {
			try {
				conn.close();
			}catch(Exception e) {
				System.out.println("Error:close2"+e);
			}
		}
	}
	public void memberJoin(MemberVO member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = connect();
			pstmt = conn.prepareStatement("insert into member values(?,?,?,?,?);");
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getBirth());
			pstmt.executeUpdate();
		}catch(Exception e){
			
		}finally {
			close(conn,pstmt);
			
		}
		
	}
	public ArrayList<MemberVO> memberList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO member = null;
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		try {
			conn = connect();
			pstmt = conn.prepareStatement("select * from member;");
						
			rs = pstmt.executeQuery();
			while(rs.next()) {
				member = new MemberVO();
				member.setId(rs.getString(1));
				member.setPasswd(rs.getString(2));
				member.setName(rs.getString(3));
				member.setEmail(rs.getString(4));
				member.setBirth(rs.getString(5));
				list.add(member);
			}
		}catch(Exception e){
			
		}finally {
			close(conn,pstmt);
			
		}
		return list;
	}
	
	public String memberLogin(String id) {
		String passwd = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = connect();
			pstmt = conn.prepareStatement("select passwd from member where id=?;");
			pstmt.setString(1,id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				passwd = rs.getString(1);
			}
		}catch(Exception e) {
			System.out.println("dao.memberLoginerror:"+e);
		}finally {
			close(conn,pstmt);
		}
		return passwd;
	}


}
