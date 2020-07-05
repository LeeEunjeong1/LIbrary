<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
도서 검색 결과
	<%
		String result = (String)request.getAttribute("result");
		if(result != null)
			out.print(result);
		else
		{
	%>
		${book.bookname} / ${book.author} / ${book.bookfield} / ${book.publisher} / ${book.publishyear}
	<%} %> 
	
	<br> <%@ include file = "home.jsp" %>
</body>
</html>