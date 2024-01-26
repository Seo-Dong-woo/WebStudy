<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	이항연산자
	=> 산술 연산자(+, -, *, /, %)
	+: 산술, 문자열 결합
	/: 0으로 나눌 수 없음, 정수/정수=실수
	                  ===========
	%: 왼쪽부호가 남음
	   -5 % -2 => -1
	   5 % -2 => 1
	   -5 % 2 => -1
	   5 % 2 => 1
	"10" + "10" => 1020
	"10" - "20" => 오류, -10
	"10" * "20" => 200
	"10" / "20" => 0.5
	=> +외의 다른 산술연산 시 자동으로 parseInt()
 --%>
<%
	int a=10;
	request.setAttribute("a", a);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload=function(){
	document.write((5/2) + "<br>")
	document.write("10" + "20" + "<br>");
	document.write(("10" - "20") + "<br>");
	document.write(("10" * "20") + "<br>");
	document.write(("10" / "20") + "<br>");
	document.write(("10" % "20") + "<br>");
	
	// 주의점
	/*
		undefined => 변수의 초기화가 안된 상태, 변수 선언이 없는 경우
		             ==================
		               자동 초기화가 없음
		NaN => 연산처리가 안된 상태
		Infinity: 0으로 나눌 수 없음
	*/
	let m='A'; // char(X)   String(O)
	let n=10;
	document.write("m+n=" + (m+n) + "<br>")	// A10
	document.write("m-n=" + (m-n) + "<br>")
	document.write("m/n=" + (n/0) + "<br>")
	
	let k;
	document.write("k=" + k + "<br>")
	
	let a=${a}
	document.write("a=" + a + "<br>")
	
}
</script>
</head>
<body>

</body>
</html>