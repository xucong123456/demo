<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!-- import easyui-css -->
<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">
<!-- 引入easyu的js文件 -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script type="text/javascript">

</script>
<body class="easyui-layout">

	<div data-options="region:'center',title:'当前位置：员工管理> 删除员工'"
		style="padding: 5px; background: #eee;">
		<!-- 展现tabs -->

		<div>
		<form action="deleteemployee" ,method="post">
			<table>
				<tr>
					<td class="font3 fftd">员工ID：<input type="text" name="eid"
						id="name" size="20" /></td>

				</tr>

			</table>
			<h6>---------------------------------------------------------------------------------------------------</h6>
			<table border="0" cellspacing="0" cellpadding="0" >
				<td>
				<tr>
					&nbsp;&nbsp;&nbsp;
					<input type="submit" value="删除" />
				</tr>
				<tr>
					&nbsp;&nbsp;&nbsp;
					<input type="reset" value="取消" />
				</tr>
				</td>
			</table>
</form>

		</div>


	</div>



</body>
</html>