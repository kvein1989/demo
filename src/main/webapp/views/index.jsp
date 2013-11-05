<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet" type="text/css" href="${path }/jquery/ligerUI/skins/Aqua/css/ligerui-all.css">
<script type="text/javascript" src="${path }/jquery/jquery-1.5.2.min.js"></script>
<script type="text/javascript" src="${path }/jquery/ligerUI/js/ligerui.all.js"></script>
<script type="text/javascript">
	var tab = null;
	var accordion = null;
	$(function() {

		//布局
		$("#layout1").ligerLayout({
			leftWidth : 190,
			height : '100%',
			heightDiff : -34,
			space : 4,
			onHeightChanged : f_heightChanged
		});

		var height = $(".l-layout-center").height();

		//Tab
		$("#framecenter").ligerTab({
			height : height
		});

		//面板
		$("#accordion1").ligerAccordion({
			height : height - 24,
			speed : null
		});

		$(".l-link").hover(function() {
			$(this).addClass("l-link-over");
		}, function() {
			$(this).removeClass("l-link-over");
		});

		tab = $("#framecenter").ligerGetTabManager();
		accordion = $("#accordion1").ligerGetAccordionManager();
		$("#pageloading").hide();

	});
	function f_heightChanged(options) {
		if (tab)
			tab.addHeight(options.diff);
		if (accordion && options.middleHeight - 24 > 0)
			accordion.setHeight(options.middleHeight - 24);
	}
	function f_addTab(tabid, text, url) {
		tab.addTabItem({
			tabid : tabid,
			text : text,
			url : url
		});
	}
</script>
<style type="text/css">
body,html {
	height: 100%;
}

body {
	padding: 0px;
	margin: 0;
	overflow: hidden;
}

.l-link {
	display: block;
	height: 26px;
	line-height: 26px;
	padding-left: 10px;
	text-decoration: underline;
	color: #333;
}

.l-link2 {
	text-decoration: underline;
	color: white;
	margin-left: 2px;
	margin-right: 2px;
}

.l-layout-top {
	background: #102A49;
	color: White;
}

.l-layout-bottom {
	background: #E5EDEF;
	text-align: center;
}

.l-link {
	display: block;
	line-height: 22px;
	height: 22px;
	padding-left: 16px;
	border: 1px solid white;
	margin: 4px;
}

.l-link-over {
	background: #FFEEAC;
	border: 1px solid #DB9F00;
}

.l-winbar {
	background: #2B5A76;
	height: 30px;
	position: absolute;
	left: 0px;
	bottom: 0px;
	width: 100%;
	z-index: 99999;
}

.space {
	color: #E7E7E7;
}
/* 顶部 */
.l-topmenu {
	margin: 0;
	padding: 0;
	height: 31px;
	line-height: 31px;
	position: relative;
	border-top: 1px solid #1D438B;
}

.l-topmenu-logo {
	color: #E7E7E7;
	padding-left: 35px;
	line-height: 26px;
	background-color: blue no-repeat 10px 5px;
}

.l-topmenu-welcome {
	position: absolute;
	height: 24px;
	line-height: 24px;
	right: 30px;
	top: 2px;
	color: #070A0C;
}

.l-topmenu-welcome a {
	color: #E7E7E7;
	text-decoration: underline
}
</style>
</head>
<body>
	<div id="topmenu" class="l-topmenu">
		<div class="l-topmenu-logo">deme</div>
		<div class="l-topmenu-welcome">
			<a href="#" class="l-link2" target="_blank">修改密码</a>
			<span class="space">|</span> 
			<a href="#" class="l-link2" target="_blank">退出</a>
		</div>
	</div>
	<div id="layout1">
		<div position="left" title="菜单管理">
			 <div title="系统管理">
			 	<a class="l-link" href="javascript:f_addTab('studentList','用户管理','${path }/user/list.do')">用户管理</a>
			 </div>
		</div>
		<div position="center" id="framecenter">
			<div tabid="home" title="首页">
				什么也没有
			</div>
		</div>
	</div>
</body>
</html>