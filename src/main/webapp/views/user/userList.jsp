<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/spring-15/user/addUI.do">添加</a>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>用户名</th>
				<th>密码</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users }" var="user">
				<tr>
					<td>${user.userId }</td>
					<td>${user.username }</td>
					<td>${user.password }</td>
					<td>
						<a href="/spring-15/user/delete.do?userId=${user.userId }">删除</a>
						<a href="/spring-15/user/updateUI.do?userId=${user.userId }">修改</a>
						<a href="/spring-15/user/detail.do?userId=${user.userId }">详情</a>
					</td>
				</tr>
			</c:forEach>
		
		</tbody>
	</table>
</body>
</html>