<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- import easyui-css -->
<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">
<!-- 引入easyu的js文件 -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<style type="text/css">
.login {
	height: 150px;
	width: 300px;
	background-color: rgba(255, 255, 255, .0);
	margin-top: 200px;
}
</style>
</head>
<body>

	<div class="htmleaf-container">
		<div class="wrapper">
			<div class="container">
				<h1>Welcome</h1>

				<form class="form" action="login" method="post">
					<input type="text" placeholder="Username" name="uid"> <input
						type="password" placeholder="Password" name="password">
					<button type="submit" id="login-button">Login</button>
				</form>
			</div>

			<ul class="bg-bubbles">
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
			</ul>

		</div>
	</div>

	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>

	<!-- 定义了一个表单 -->
	<!--  <center>
	<form action="login" method="post">
		<table class="login">
			<tr>
				<td colspan="2" align="center">人力资源管理系统</td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input name="name" class="easyui-textbox" data-options="iconCls:'icon-search'" style="width:200px"> </td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;&nbsp;码：</td>
				<td><input name="password" class="easyui-passwordbox" prompt="Password" iconWidth="28" style="width:200px;height:34px;padding:10px"> </td>
			</tr>
			<tr >
				<td >
					<input  type="submit" value="登录"
					style="border-radius: 20px; width:100px; height: 30px"
					 />
				</td>
				<td>
					<input type="submit" value="退出"
					style="border-radius: 20px; width:100px; height: 30px"
					 />
				</td>
			</tr>
		</table>
	</form>	 
	</center>
	-->
</body>
</html>