<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ include file="/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${path }/jquery/ligerUI/skins/Aqua/css/ligerui-all.css">
<script type="text/javascript" src="${path }/jquery/jquery-1.5.2.min.js"></script>
<script type="text/javascript" src="${path }/jquery/ligerUI/js/ligerui.all.js"></script>
<script type="text/javascript">
	var $grid;
	$(function() {
		$grid = $("#grid").ligerGrid({
			columns: [
                { display: 'ID', name: 'userId', type: 'int' },
                { display: '用户名', name: 'username' },
                { display: '密码', name: 'password' }
            ], width: '90%', pkName: 'userId', pageSizeOptions: [5, 10, 15, 20],usePager:true
		});
		
		$.get("${path}/user/o_list.do",function(data){
			var jsonObj = {};
			jsonObj.Rows = data;
			$grid.set({ data: jsonObj }); 
		});
	});
</script>
</head>
<body>
	
	<div id="grid" class="liger-grid">
	</div>
</body>
</html>