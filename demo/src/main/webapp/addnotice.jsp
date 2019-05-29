<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CSI员工之家</title>
</head>
<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script type="text/javascript">
	
</script>
<body class="easyui-layout">

	
	<div data-options="region:'center',title:'当前位置：公告管理 > 公告修改'"
		style="padding: 5px; background: #eee;">
		<!--     中间容器 -->
		<div data-options="fit:'true'"
			style="background-color: white; width: 100%; height: 100%">
			<div data-options="title:'North Title',fit:'true'"
				style="background: #eee; border: 1px solid rgb(149, 182, 231); width: 100%; height: 800px">

				<!--     搜索框   -->
				公告标题: <input type="text" /> <br> 公告内容: <input type="text"
					style="width: 500px; height: 150px" /><br> <a id="btn"
					href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-add'">添加</a> <a id="btn" href="#"
					class="easyui-linkbutton" data-options="iconCls:'icon-cut'">删除</a>
			</div>
			<center>
				<div>
					<td
						style="COLOR: #0061de; MARGIN-RIGHT: 3px; PADDING-TOP: 2px; TEXT-DECORATION: none">
						<span class="disabled">上一页</span> <span class="current">1</span> <span
						class="disabled">下一页</span> &nbsp;跳转到&nbsp;&nbsp; <input
						style="text-align: center; BORDER-RIGHT: #aaaadd 1px solid; PADDING-RIGHT: 5px; BORDER-TOP: #aaaadd 1px solid; PADDING-LEFT: 5px; PADDING-BOTTOM: 2px; MARGIN: 2px; BORDER-LEFT: #aaaadd 1px solid; COLOR: #000099; PADDING-TOP: 2px; BORDER-BOTTOM: #aaaadd 1px solid; TEXT-DECORATION: none"
						type="text" size="2" id="pager_jump_page_size">&nbsp; <input
						type="button"
						style="text-align: center; BORDER-RIGHT: #dedfde 1px solid; PADDING-RIGHT: 6px; BACKGROUND-POSITION: 50% bottom; BORDER-TOP: #dedfde 1px solid; PADDING-LEFT: 6px; PADDING-BOTTOM: 2px; BORDER-LEFT: #dedfde 1px solid; COLOR: #0061de; MARGIN-RIGHT: 3px; PADDING-TOP: 2px; BORDER-BOTTOM: #dedfde 1px solid; TEXT-DECORATION: none"
						value="确定" id="pager_jump_btn">
					</td>
				</div>
			</center>
		</div>
	</div>
</body>
</html>