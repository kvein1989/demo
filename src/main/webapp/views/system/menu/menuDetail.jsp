<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/common/common.jsp"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="width: 90%;border: 1;">
		<tr>
			<td style="width: 20%;text-align: right;border: 1">菜单名称</td>
			<td>${menu.menuName }</td>
		</tr>
		<tr>
			<td>菜单路径</td>
			<td>${menu.menuUrl }</td>
		</tr>
		<tr>
			<td>是否是叶子节点</td>
			<td>
				<c:choose>
					<c:when test="${menu.isLeaf == 0 }">
						是
					</c:when>
					<c:otherwise>
						否
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr>
			<td>排序</td>
			<td>${menu.sort }</td>
		</tr>
	</table>
</body>
</html>