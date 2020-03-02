<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生系统查询页面</title>
</head>
<body>
	<form action="Check" method="post">
		 <table>
			<tr>
				<td>姓名:</td>
				<td>年龄:</td>
				<td>性别:</td>
			</tr>
			<c:forEach items="${lists }" var="list">
			<tr>
				<td>${list.sname }</td>
				<td>${list.sage }</td>
				<td>${list.ssex }</td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>