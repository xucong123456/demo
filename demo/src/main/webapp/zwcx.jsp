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
<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	function post(){
		
		$('#dg').datagrid({
			url:"searchposition",
			type:"post",
			queryParams: {
				"jobname":$('#jobname').val(),
			}
		});

	}
</script> 
<body class="easyui-layout">

	<div data-options="region:'center',title:'当前位置：职位管理 > 职位查询'"
		style="padding: 5px; background: #eee;">
		<!-- 展现tabs -->



		部门名称： <input id="jobname" class="easyui-textbox"
			data-options="iconCls:'icon-search'" style="width: 300px"> 
			<a id="btn"  class="easyui-linkbutton" data-options="iconCls:'icon-search',text:'搜索'" onclick="post()"></a>

			
		<table  id="dg" class="easyui-datagrid" style="width: 100%; height: 400px"
			data-options="url:'searchposition',pagination:true,striped:true">
			<thead>
				<tr>
					<th field="ck" checkbox="true"></th>
					<th data-options="field:'jobname',width:650,align:'center'">职位名称</th>
					<th data-options="field:'jobinfo',width:650,align:'center'">详细信息</th>
					<!-- <th data-options="field:'price',width:250,align:'left'">操作</th> -->
				</tr>
			</thead>
			<tbody></tbody>
		</table>
	</div>
</body>
</html>