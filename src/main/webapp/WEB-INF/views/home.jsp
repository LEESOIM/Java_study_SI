<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>SOIM Bank World! π°πΈπ³π°πΈπ³ </h1>
<P>The time on the server is ${serverTime}. </P>
	<div>
		<c:if test="${empty sessionScope.success }">
			<a href="member/login.iu">λ‘κ·ΈμΈ</a>
			<a href="member/join.iu">νμκ°μ</a>
		</c:if>
		
		<c:if test="${not empty sessionScope.success }">
			<a href="">λ§μ΄νμ΄μ§</a>		
			<a href="member/logout.iu">λ‘κ·Έμμ</a>
		</c:if>
	</div>
	
	
	<div>
		<a href="member/search.iu">μμ΄λ μ°ΎκΈ°</a>
		<a href="bankbook/list.iu">μνλ¦¬μ€νΈ</a>
	</div>
</body>
</html>
