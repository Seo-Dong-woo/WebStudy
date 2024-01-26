package com.sist.dao;

import java.util.*;

import com.sist.dbcp.CreateDBCPConnection;
import com.sist.vo.SeoulVO;

import java.sql.*;

public class SeoulDAO {
	private Connection conn; // 데이터베이스 연결
	private PreparedStatement ps; // sql전송, 결과값
	private static SeoulDAO dao;
	// DBCP라이브러리
	private CreateDBCPConnection dbconn=new CreateDBCPConnection();
	// 1. 기능: 명소 => seoul_location
	public List<SeoulVO> seoulLocationListData(int page, String tab)
	{
		List<SeoulVO> list=new ArrayList<SeoulVO>();
		try
		{
			// 1. 연결
			conn=dbconn.getConnection();
			// 2. SQL문장 전송
			String sql="SELECT no, title, poster, num "
					 + "FROM(SELECT no, title, poster, rownum AS num "
					 + "FROM(SELECT no, title, poster "
					 + "FROM " + tab + " ORDER BY no ASC)) "
					 + "WHERE num BETWEEN ? AND ?";
			// 3. 미리 전송
			ps=conn.prepareStatement(sql);
			// 4. 실행 요청 전에 ?에 값을 채움
			int rowSize=12;
			int start=(rowSize*page)-(rowSize-1); // rownum은 1번부터 시작
			int end=rowSize*page;
			
			ps.setInt(1, start);
			ps.setInt(2, end);
			// 5. 실행 후에 결과값을 받음
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				SeoulVO vo=new SeoulVO();
				vo.setNo(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setPoster(rs.getString(3));
				
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbconn.disConnection(conn, ps);
		}
		return list;
	}
	public int seoulLocationTotalPage(String tab)
	{
		int total=0;
		try
		{
			conn=dbconn.getConnection();
			String sql="SELECT CEIL(COUNT(*)/12.0) FROM " + tab;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			total=rs.getInt(1);
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbconn.disConnection(conn, ps);
		}
		return total;
	}
	// 2. 기능: 자연 => seoul_nature
	// 3. 기능: 쇼핑 => seoul_shop
	
}
