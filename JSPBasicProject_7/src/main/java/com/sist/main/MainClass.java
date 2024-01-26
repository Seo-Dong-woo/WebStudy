package com.sist.main;

import java.net.URLEncoder;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String name="홍길동";
		System.out.println(URLEncoder.encode(name,"UTF-8"));
		
	}

}
