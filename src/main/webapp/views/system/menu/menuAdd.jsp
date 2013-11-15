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
	<form action="${path }/system/menu/o_add.do" method="post">
		<table>
			<tr>
				<td>菜单名称:</td>
				<td>
					<input type="text" name="menuName">
				</td>
			</tr>
			<tr>
				<td>菜单路径：</td>
				<td>
					<input type="text" name="menuUrl">
				</td>
			</tr>
			<tr>
				<td>是否是叶子节点：</td>
				<td>
					<select name="isLeaf">
						<option value="0">是</option>
						<option value="1">否</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>排序：</td>
				<td>
					<input type="text" name="sort">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>	
	</form>
</body>
</html>