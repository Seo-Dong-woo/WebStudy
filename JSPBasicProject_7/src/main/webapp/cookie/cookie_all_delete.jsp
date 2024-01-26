<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] cookies=request.getCookies();
	if(cookies!=null)
	{
		for(int i=0;i<cookies.length;i++)
		{
			if(cookies[i].getName().startsWith("food_"))
			{
				cookies[i].setPath("/");
				cookies[i].setMaxAge(0); // 저장 기간을 없앰(모든 쿠키를 삭제)
				response.addCookie(cookies[i]);
			}
		}
	}
	response.sendRedirect("find.jsp");
%>