package com.sist.controller;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import com.sist.model.*;
/*
 *   1. 관련된 클래스 여러 개 있음 => 인터페이스 통합
 *   2. 조건문 없이 사용 => Map
 *   3. 미리 클래스 메모리 할당 => 주소
 *      ================= 싱글턴
 *   4. Model을 찾는 경우에는 URL주소를 이용해서 찾음
 *   5. 구분
 *      ===
 *      request를 JSP로 전송 => forward
 *      request를 초기화하고 JSP만 호출 ==> redirect
 *      JSP를 변경하지 않고 전송(데이터만 전송) Ajax(void)
 *      
 *   => Controller
 *      1. 요청을 받음
 *      2. Model을 찾음
 *      3. Model의 메소드 호출 => request
 *      4. request를 JSP로 전송
 *   => Model
 *      1. 요청값을 받음 => 매개변수(request)
 *      2. 요청 처리 => DAO
 *      3. 결과값을 request에 담는다 => setAttribute()
 *   => View
 *      1. Controller에서 보내준 request를 출력
 */
@WebServlet("*.do")
// list.do, update.do, delete.do, insert.do
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map clsMap=new HashMap();

	public void init(ServletConfig config) throws ServletException {
		clsMap.put("list", new ListModel());
		clsMap.put("insert", new InsertModel());
		clsMap.put("update", new UpdateModel());
		clsMap.put("delete", new DeleteModel());
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd=request.getRequestURI();
		/*
		 *   /JSPMVCProject_2/list.do
		 *   ================
		 *     ContextPath
		 */
		System.out.println("cmd=>1:" + cmd);
		cmd=cmd.substring(request.getContextPath().length()+1, cmd.lastIndexOf("."));
		System.out.println("cmd=>2:" + cmd);
		
		Model model=(Model)clsMap.get(cmd);
		System.out.println("model:" + model);
		String jsp=model.execute(request);
		
		RequestDispatcher rd=request.getRequestDispatcher(jsp);
		rd.forward(request, response);
	}

}
