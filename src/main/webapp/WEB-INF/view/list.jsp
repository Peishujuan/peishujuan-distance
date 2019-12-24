<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fm"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html >
<html>
<head>
<meta  charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="/resource/css/index_work.css"/> 
 <link rel="stylesheet"  href="/resource/css/bootstrap.css"/> 
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
<div class="form-group form-inline">
	<form action="list" method="post">
	经度<input type="text" name="jd" value="${vo.jd }">
	纬度<input type="text" name="wd" value="${vo.wd }">
	距离区间（m）<input type="text" name="start" value="${vo.start }">
				--<input type="text" name="end" value="${vo.end }">
	<button type="submit">查询</button>
	</form>
</div>
<table class="table">
		<tr>
			<td>序号</td>
			<td>车牌</td>
			<td>时间</td>
			<td>经度</td>
			<td>维度</td>
			<td>距离(m)</td>
		</tr>
		<c:forEach items="${info}" var="info" varStatus="i">

			<tr>
				<td>${i.count }</td>
				<td>${info.cardno }</td>
				<td>${info.created }</td>
				<td>${info.jd}</td>
				<td>${info.wd }</td>
				<td>${info.distance }</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>