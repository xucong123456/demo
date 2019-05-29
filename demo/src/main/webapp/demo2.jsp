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
	<div data-options="region:'center',title:'当前位置：部门管理 > 修改部门'"
		style="padding: 5px; background: #eee;">
		<!-- 展现tabs -->
		
		<div>
		<table >
		    		<tr>
		    			<td class="font3 fftd">部门名称：<input type="text" name="name" id="name" size="20" value="技术部"/></td>
		    			<td class="font3 fftd">详细描述：<input type="text" name="remark" id="remark" size="20" value="技术部"/></td>
		    		</tr>
	
		    	</table>
		    	 <h6>---------------------------------------------------------------------------------------------------</h6>
		    <a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">添加</a>  
		<a id="btn1" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">取消</a>  	

		 
 </div>
 

		</div>
 

	
</body>
</html>