<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>SOIM Bank World! 💰💸💳💰💸💳 </h1>
<P>The time on the server is ${serverTime}. </P>
	<div>
		<c:if test="${empty sessionScope.success }">
			<a href="member/login.iu">로그인</a>
			<a href="member/join.iu">회원가입</a>
		</c:if>
		
		<c:if test="${not empty sessionScope.success }">
			<a href="">마이페이지</a>		
			<a href="member/logout.iu">로그아웃</a>
		</c:if>
	</div>
	
	
	<div>
		<a href="member/search.iu">아이디 찾기</a>
		<a href="bankbook/list.iu">상품리스트</a>
	</div>
</body>
</html>
