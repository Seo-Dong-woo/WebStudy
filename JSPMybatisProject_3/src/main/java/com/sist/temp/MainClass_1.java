package com.sist.temp;

public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String price="20,300원";
		price=price.replaceAll("[0-9]", "");
		// 숫자 => [^0-9], 알파벳 => [A-Za-z], 한글 => [가-힣]
		// ^[] => 시작    [^] => 제외
		// . => 임의의 한 글자
		// *(0이상)/+(1이상)/?(0,1)
		// 정규식
		// [] => 패턴, {} => 개수
		// [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
		System.out.println(price);
	}

}
