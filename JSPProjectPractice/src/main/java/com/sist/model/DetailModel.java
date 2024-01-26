package com.sist.model;

import javax.servlet.http.HttpServletRequest;

import com.sist.dao.GoodsDAO;
import com.sist.vo.GoodsVO;

public class DetailModel implements Model {

	@Override
	public String handleRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String no=request.getParameter("no");
		// DAO
		GoodsDAO dao=GoodsDAO.newInstance();
		GoodsVO vo=dao.goodsDetail(Integer.parseInt(no));
		request.setAttribute("vo", vo);
		// request
		return "goods/detail.jsp";
	}

}
