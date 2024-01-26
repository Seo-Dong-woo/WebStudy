<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	1. 선택자 => Javascript
	2. 글자 관련
	3. margin/padding/border
	4. background
	5. position
	     => fixed
	     => relative
	     => 배치 => top/bottom/left/right
	6. overflow
	====================================
	CSS는 약간의 수정
	=> 퍼블리셔
	
	HTML/CSS => 화면 UI
	JavaScript => UI 제어
	Java => 데이터 관리
	        오라클 ==> 자바 ==> HTML/JavaScript
	오라클 => 데이터 저장 장소
	============= 통합(Spring)
	Spring-Boot <===> Front
	=========== MSA
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		margin: 0px;
		padding: 0px;
	}
	body{
		width: 960px;
		margin: 0px auto;
		overflow: hidden;
	}
	#nav{
		width: 300px;
		float: left;
	}
	#section{
		width: 660px;
		float: right;
	}
	li{
		list-style: none;
	}
	@media screen and (max-width: 768px){
		body{width: auto}
		#nav{width: auto; float: none}
		#section{width: auto; float: none}
	}
</style>
</head>
<body>
	<div id="nav">
		<ul>
			<li>홈</li>
			<li>뉴스 1</li>
			<li>뉴스 2</li>
		</ul>
	</div>
	<div id="section">
	17일 미국 스포츠전문매체 디애슬레틱이 보도한 샌프란시스코가 이정후를 영입한 배경을 보면 왜 그런 분위기가 만들어졌는지 이해가 간다.
	심지어 샌프란시스코 파르한 자이디 사장과 피트 푸틸라 단장은 이정후와 대면 면담 한 번 없이 1억 1300만 달러를 '질렀고', 그대로 합의에 성공했다.
	자이디 사장과 푸틸라 단장이 이정후를 처음 만난 날이 바로 16일 입단 기자회견이었다.

	디애슬레틱은 "협상에 가속이 붙고, 재정적인 변수가 사라졌을 때 샌프란시스코는 에이전트 스캇 보라스와 전화 통화로 합의를 마쳤다.
	자이디 사장은 기자회견 전까지 이정후를 직접 만나지 않았다. 이것은 샌프란시스코가 이정후를 얼마나 확신하는지 보여준다"고 보도했다.
	</div>
</body>
</html>