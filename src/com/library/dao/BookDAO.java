package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.library.vo.BookVO;
import com.library.dao.BookDAO;

public class BookDAO {
private static BookDAO dao = new BookDAO();
	
	private BookDAO() {}
	
	public static BookDAO getInstance() {
		return dao;
	}
	
	public Connection connect() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/library";
			String user = "root";
			String password = "cs1234";
			conn=DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			System.out.println("error:connect"+e);
		} 
		return conn;
	}
	
	public void close(Connection conn, PreparedStatement ps) {
		if(ps != null) {
			try {
				ps.close();
			} catch(Exception e) {
				System.out.print("Error:close"+e);
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch(Exception e) {
				System.out.print("Error:close2"+e);
			}
		}
	}
	
	public void bookInsert(BookVO book) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn=connect();
			pstmt = conn.prepareStatement("insert into book values(?,?,?,?,?)");
			pstmt.setString(1, book.getBookname());
			pstmt.setString(2, book.getAuthor());
			pstmt.setString(3, book.getBookfield());
			pstmt.setString(4, book.getPublisher());
			pstmt.setString(5, book.getPublishyear());
			pstmt.executeUpdate();
		} catch(Exception e) {}
		finally {
			close(conn,pstmt);
		}
	}
	
	public BookVO bookSearch(String bookname) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookVO book = null;
		try {
			conn=connect();
			pstmt = conn.prepareStatement("select * from book where bookname=?;");
			pstmt.setString(1, bookname);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				book = new BookVO();
				book.setBookname(rs.getString(1));
				book.setAuthor(rs.getString(2));
				book.setBookfield(rs.getString(3));
				book.setPublisher(rs.getString(4));
				book.setPublishyear(rs.getString(5));
			}
		} catch(Exception e) {
			System.out.println("error1"+e);
		}
		finally {
			close(conn,pstmt);
		}
		return book;
	}
	
	public ArrayList<BookVO> bookList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookVO book = null;
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		try {
			conn=connect();
			pstmt = conn.prepareStatement("select * from book;");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				book = new BookVO();
				
				book.setBookname(rs.getString(1));
				book.setAuthor(rs.getString(2));
				book.setBookfield(rs.getString(3));
				book.setPublisher(rs.getString(4));
				book.setPublishyear(rs.getString(5));
				list.add(book);
			}
		} catch(Exception e) {
			System.out.println("error1"+e);
		}
		finally {
			close(conn,pstmt);
		}
		return list;
	}
}
