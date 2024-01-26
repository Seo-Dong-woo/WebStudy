package com.sist.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import com.sist.dao.*;

@WebServlet("/FoodListServlet")
public class FoodListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 브라우저를 통해서 요청 시 처리해서 브라우저로 HTML을 전송
		// 톰캣에 의해 자동 호출
		// 메소드 영역 => JSP임 => service
		// JSP => 실행 => class변경 => 컴파일해서 실행
		// 전송타입 => html, xml, json
		response.setContentType("text/html; charset=UTF-8");
		//                       text/xml, text/plain
		// HTML전송
		PrintWriter out=response.getWriter();
		//              -------------------- 접속한 클라이언트 브라우저(접속한 사람의 ip에 html을 보내주겠다)
		FoodDAO dao=FoodDAO.newInstance(); // 싱글턴으로 객체 생성
		List<FoodVO> list=dao.foodListData(1);
		out.print("<html>");
		out.print("<body>");
		out.print("<center>");
		out.print("<h1>맛집 1000Top</h1>");
		out.print("<table border=1 width=800>");
		out.print("<tr>");
		out.print("<th width=10%>순위</th>");
		out.print("<th width=15%></th>");
		out.print("<th width=20%>업체명</th>");
		out.print("<th width=15%>업종</th>");
		out.print("<th width=40%>주소</th>");
		out.print("</tr>");
		for(FoodVO vo:list)
		{
			out.print("<tr>");
			out.print("<td width=10%>" + vo.getFno() + "</td>");
			out.print("<td width=15%><img src=" + vo.getPoster() + " width=30 height=30></td>");
			out.print("<td width=20%>" + vo.getName() + "</td>");
			out.print("<td width=15%>" + vo.getType() + "</td>");
			out.print("<td width=40%>" + vo.getAddress() + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</center>");
		out.print("</body>");
		out.print("</html>");
	}

}
