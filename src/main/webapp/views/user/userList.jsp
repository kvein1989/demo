<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/resources/common/common.jsp"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<display:table name="users" uid="user" cellpadding="0" cellspacing="0" pagesize="10"
		requestURI="${path }/user/list.do">
		<display:column property="userId" title="ID"></display:column>
		<display:column property="username" title="用户名"></display:column>
		<display:column property="password" title="密码"></display:column>
	</display:table>
</body>
</html>