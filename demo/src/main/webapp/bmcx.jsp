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
			url:"searchdepartment",
			type:"post",
			queryParams: {
				"dname":$('#dname').val(),
			}
		});

	}
</script> 
<body class="easyui-layout">
	<div data-options="region:'center',title:'当前位置：部门管理 > 部门查询'"
		style="padding: 5px; background: #eee;">
		<!-- 展现tabs -->

		部门名称： <input id="dname" class="easyui-textbox"
			data-options="iconCls:'icon-search'" style="width: 300px"> 
			<a id="btn"  class="easyui-linkbutton" data-options="iconCls:'icon-search',text:'搜索'" onclick="post()"></a>

		<table id="dg" class="easyui-datagrid" style="width: 100%; height: 400px"
			data-options="url:'searchdepartment',pagination:true,striped:true">
			<thead>

				<tr>
					<th field="ck" checkbox="true"></th>
					<th data-options="field:'dname',width:650,align:'center'">部门名称</th>
					<th data-options="field:'dinfo',width:650,align:'center'">详细信息</th>
					<!-- <th data-options="field:'price',width:200,align:'left'">操作</th> -->
				</tr>
			</thead>
			  <tbody>   
              </tbody> 
		</table>
	</div>
<!-- 
				<tbody>
			<tbody>
				<tr>
					<td></td>
					<td>技术部</td>
					<td>技术部</td>
					<td><a href="demo2.jsp"> <img title="修改"
							src=<%=request.getContextPath()%> /images/1.png>
					</a></td>

				</tr>
				<tr>
					<td></td>
					<td>运营部</td>
					<td>运营部</td>
					<td><a href="demo2.jsp"> <img title="修改"
							src=<%=request.getContextPath()%> /images/1.png>
					</a></td>

				</tr>
				<tr>
					<td></td>
					<td>财务部</td>
					<td>财务部</td>
					<td><a href="demo2.jsp"> <img title="修改"
							src=<%=request.getContextPath()%> /images/1.png>
					</a></td>

				</tr>
				<tr>
					<td></td>
					<td>总公办</td>
					<td>总公办</td>
					<td><a href="demo2.jsp"> <img title="修改"
							src=<%=request.getContextPath()%> /images/1.png>
					</a></td>

				</tr>
			</tbody>
			</tbody>
 -->
</body>
</html>