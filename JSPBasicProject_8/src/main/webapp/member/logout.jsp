<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.invalidate(); // 세션에 있는 모든 내용 삭제
	response.sendRedirect("../main/main.jsp");
%>
