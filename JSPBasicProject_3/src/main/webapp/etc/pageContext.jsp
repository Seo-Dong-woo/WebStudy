<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	1. 내장 객체 얻기
	   getRequest(), getResponse(), getOut()
	   getSession(), getPage(), getException()
	   application => getServletContext()
	   => 사용 빈도가 거의 없음
	   
	   request.getParameter()
	   pageContext.getRequest().getParameter()
	2. 웹 흐름 제어
	   include(), forward() => 파일마다 request 공유를 함
	   pageContext.include() ==> X
	     => <jsp:include>
	     =>
	         1. <%@ include file=""%>: 정적
	              => file에는 반드시 file명을 설정
	                 menu/footer
	         2. <jsp:include page="">: 동적
	              => 내용 출력 시 변경
	              page=변수명
	              
	         => JSP안에 특정 위치에 다른 JSP를 포함
	         a.jsp
	           <html>
	               <body>
	                   <%
	                       int a=10;
	                   %>
	                   <h1><%=a %></h1>
	               </body>
	           </html>
	           ========================
	           <html>
	               <body>
	                   <h1>10</h1>
	                   <html>
	                       <body>
	                           <h1>100</h1>
	                       </body>
	                   </html>
	               </body>
	           </html>
	           ========================
	           b. jsp
	           <html>
	               <body>
	               <%
	                   int a=100;
	               %>
	                   <h1><%=a %></h1>
	                   ==========================
	                   <%@ include file="a.jsp"
	                   <html>
	               	       <body>
	                       <%
	                           int a=10;
	                       %>
	                       <h1><%=a %></h1>
	                       </body>
	                   </html>
	                   ==========================
	                   <jsp:include page="a.jsp">
	               </body>
	           </html>
	           ========================
	           <html>
	               <body>
	                   <h1>100</h1>
	               </body>
	           </html>
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>