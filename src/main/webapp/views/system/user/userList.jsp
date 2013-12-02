<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
</head>
<body>
	<div style="width:800px;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-add" onclick="add()">增加</a>
                        <a class="mini-button" iconCls="icon-remove" onclick="remove()">删除</a>       
                    </td>
                </tr>
            </table>           
        </div>
    </div>
	
	<div id="datagrid1" class="mini-datagrid" style="width:100%;height: 100%;" allowResize="true"
        url="${path }/system/user/list.do"  idField="id" multiSelect="true" >
    	<div property="columns">
		    <div type="checkcolumn" ></div>        
		    <div field="username" width="120" headerAlign="center">用户名</div>    
		    <div field="password" width="120" headerAlign="center">密码</div>   
    	</div>
    </div>
    
    <script type="text/javascript">
        mini.parse();

        var grid = mini.get("datagrid1");
        grid.load();

		function add() {
            mini.open({
                url: "${path}/system/user/v_add.do",
                title: "新增员工", width: 600, height: 360,
                ondestroy: function (action) {
                    grid.reload();
                }
            });
        }
    </script>
</body>
</html>