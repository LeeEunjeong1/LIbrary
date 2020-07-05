<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.library.vo.BookVO"%>
<%@page import="java.util.ArrayList" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<BookVO> list = (ArrayList<BookVO>) request.getAttribute("list");
		if(!list.isEmpty()) { %>
			<table border = "1">
				<tr><th>도서 이름</th><th>저자</th><th>도서 분야</th><th>출판사</th><th>출판 연도></tr>
				<%
					for(int i=0; i<list.size(); i++) {
						BookVO book = list.get(i); %>
						
						<tr><td><%=book.getBookname()%></td>
							<td><%=book.getAuthor()%></td>
							<td><%=book.getBookfield()%></td>
							<td><%=book.getPublisher()%></td>
							<td><%=book.getPublishyear()%></td>
						</tr>
				<% }
		} else {
			out.println("<h3>등록된 도서 정보가 없습니다.</h3>");
		} %>
			</table>
	<%@ include file = "home.jsp" %>
</body>
</html>