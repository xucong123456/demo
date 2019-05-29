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


	<div data-options="region:'center',title:'当前位置：公告管理 > 添加公告'"
		style="padding: 5px; background: #eee;">
		<!--     中间容器 -->
		<div data-options="fit:'true'"
			style="background-color: white; width: 100%; height: 100%">
			<div data-options="title:'North Title',fit:'true'"
				style="background: #eee; border: 1px solid rgb(149, 182, 231); width: 100%; height: 800px">

				<!--     搜索框   -->
				<form action="addbulletin" method="post">
				<table>
					<tr>
						<td class="font3 fftd">公告标题：<input type="text" name="bname"
							id="name" size="20" /></td>											
					</tr>
					<tr>
						<td class="font3 fftd">公告内容：<input type="text" name="content"
							style="width: 500px; height: 150px"  /></td>
					</tr>
					</table>
					<h6>---------------------------------------------------------------------------------------------------</h6>
						<table border="0" cellspacing="0" cellpadding="0" width="100%">
						<td>
							<tr>&nbsp;&nbsp;&nbsp;<input type="submit" value="确定"/></tr>
							<tr>&nbsp;&nbsp;&nbsp;<input type="reset" value="取消"/></tr>
						</td>				
				</table>
			</form>
			</div>
		</div>
	</div>
</body>
</html>