<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/common/common.jsp"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="${path }/resources/jquery/tree/css/demo.css" type="text/css">
	<link rel="stylesheet" href="${path }/resources/jquery/tree/css/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="${path }/resources/jquery/jquery-1.5.2.min.js"></script>
	<script type="text/javascript" src="${path }/resources/jquery/tree/js/jquery.ztree.core-3.5.js"></script>
	<script type="text/javascript" src="${path }/resources/jquery/tree/js/jquery.ztree.excheck-3.5.js"></script>
	<script type="text/javascript" src="${path }/resources/jquery/tree/js/jquery.ztree.exedit-3.5.js"></script>
	<SCRIPT type="text/javascript">
		<!--
		var setting = {
			view: {
				dblClickExpand: false
			},
			async: {
				enable: true,
				url:"${path}/system/menu/tree.do",
				autoParam:["menuId"]
			},
			data: {
				key: {
					name:"menuName"
				},
				simpleData: {
					enable: true,
					idKey: "menuId",
					pIdKey: "parentId"
				}
			},
			callback: {
				onRightClick: OnRightClick,
				onClick: zTreeOnClick
			}
		};

		function OnRightClick(event, treeId, treeNode) {
			if (!treeNode && event.target.tagName.toLowerCase() != "button" && $(event.target).parents("a").length == 0) {
				zTree.cancelSelectedNode();
				showRMenu("root", event.clientX, event.clientY);
			} else if (treeNode && !treeNode.noR) {
				zTree.selectNode(treeNode);
				showRMenu("node", event.clientX, event.clientY);
			}
		}
		
		function zTreeOnClick(event, treeId, treeNode) {
			$("#myFrame").attr("src","${path}/system/menu/detail.do?menuId=" + treeNode.menuId);
		}

		function showRMenu(type, x, y) {
			$("#rMenu ul").show();
			if (isLeaf=="0" && parentId == "-1") {
				$("#m_del").hide();
			} else {
				$("#m_del").show();
			}
			rMenu.css({"top":y+"px", "left":x+"px", "visibility":"visible"});

			$("body").bind("mousedown", onBodyMouseDown);
		}
		function hideRMenu() {
			if (rMenu) rMenu.css({"visibility": "hidden"});
			$("body").unbind("mousedown", onBodyMouseDown);
		}
		function onBodyMouseDown(event){
			if (!(event.target.id == "rMenu" || $(event.target).parents("#rMenu").length>0)) {
				rMenu.css({"visibility" : "hidden"});
			}
		}
		var addCount = 1;
		function addTreeNode() {
			hideRMenu();
			var newNode = { name:"增加" + (addCount++)};
			if (zTree.getSelectedNodes()[0]) {
				newNode.checked = zTree.getSelectedNodes()[0].checked;
				zTree.addNodes(zTree.getSelectedNodes()[0], newNode);
			} else {
				zTree.addNodes(null, newNode);
			}
		}
		function removeTreeNode() {
			hideRMenu();
			var nodes = zTree.getSelectedNodes();
			if (nodes && nodes.length>0) {
				if (nodes[0].children && nodes[0].children.length > 0) {
					var msg = "要删除的节点是父节点，如果删除将连同子节点一起删掉。\n\n请确认！";
					if (confirm(msg)==true){
						zTree.removeNode(nodes[0]);
					}
				} else {
					zTree.removeNode(nodes[0]);
				}
			}
		}
		function checkTreeNode(checked) {
			var nodes = zTree.getSelectedNodes();
			if (nodes && nodes.length>0) {
				zTree.checkNode(nodes[0], checked, true);
			}
			hideRMenu();
		}
		function resetTree() {
			hideRMenu();
			$.fn.zTree.init($("#menuTree"), setting);
		}

		var zTree, rMenu;
		$(document).ready(function(){
			$.fn.zTree.init($("#menuTree"), setting);
			zTree = $.fn.zTree.getZTreeObj("menuTree");
			rMenu = $("#rMenu");
		});
		//-->
	</SCRIPT>
	<style type="text/css">
		div#rMenu {position:absolute; visibility:hidden; top:0; background-color: #555;text-align: left;padding: 2px;}
		div#rMenu ul li{
			margin: 1px 0;
			padding: 0 5px;
			cursor: pointer;
			list-style: none outside none;
			background-color: #DFDFDF;
		}
	</style>
</head>
<body>
	<div class="content_wrap" style="width: 100%;">
		<div class="zTreeDemoBackground left">
			<ul id="menuTree" class="ztree"></ul>
		</div>
		<div style="margin-left:255px;width: 100%;">
			<iframe id="myFrame" style="width: 100%;" src="${path }/system/menu/detail.do"></iframe>
		</div>
	</div>
	<div id="rMenu">
		<ul>
			<li id="m_add" onclick="addTreeNode();">增加节点</li>
			<li id="m_del" onclick="removeTreeNode();">删除节点</li>
		</ul>
	</div>
</body>
</html>