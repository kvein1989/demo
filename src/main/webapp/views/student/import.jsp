<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${path }/student/o_import.do" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>
					上传文件：
				</td>
				<td>
					<input type="file" name="file">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="上传">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>