<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 定义了一个表单 -->
<form action="login" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="name" type="text"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="pass" type="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>	
</body>
</html>