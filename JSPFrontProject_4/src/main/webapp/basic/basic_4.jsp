<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	자바스크립트 반복문
	= do~while: 사용빈도가 거의 없음
	            조건이 후조건을 사용함 => 무조건 한 번 이상 수행
	  형식)
	      초기값
	      do
	      {
	          반복수행문장
	          증가식
	      }while(조건문)
	= while: 무한루프 => 선조건 => 수행이 안될 수도 있음
	  형식)
	       초기값
	       while(조건) ==> 조건이 false일 때까지 수행
	       {
	           반복수행문장
	           증가식
	       }
	       ==> 반복횟수가 지정이 안된 상태
	= for: 반복횟수가 지정된 경우(자바스크립트에서 반복문의 핵심)
	  => 웹: 사용자에게 보여주는 역할
	        =================
	        테이블: 게시판 => 한눈에 볼 수 잇는 개수(15~20)
	        div: card => 이미지 => 10~15
	        ======== 페이징
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
window.onload=function(){
	// do~while
	document.write("<h3>do~while</h3>")
	let i=1;
	do{
		document.write("i=" + i + "<br>");
		i++;
	}while(i<=10)
	
	document.write("<hr>")
	// while
	document.write("<h3>while</h3>")
	i=1; // 초기값
	while(i<=10)
	{
		document.write("i=" + i + "<br>")
		i++;
	}
	document.write("<hr>")
	
	document.write("<h3>for</h3>")
	for(i=1;i<=10;i++)
	{
		document.write("i=" + i + "<br>")
	}
	document.write("<hr>")
	
	document.write("<h3>break</h3>")
	for(i=1;i<=10;i++)
	{
		if(i==5) break;
		document.write("i=" + i + "<br>")
	}
	document.write("<hr>")
	
	document.write("<h3>continue</h3>")
	// 특정 부분을 제외할 경우에 주로 사용
	for(i=1;i<=10;i++)
	{
		if(i==5) continue; // i==5일 때 증가식으로 이동
		document.write("i=" + i + "<br>")
	}
	document.write("<hr>")
}
</script>
</body>
</html>