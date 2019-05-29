<%@ page language="java" import="java.util.*,com.xc.model.*,com.xc.dao.*" contentType="text/html; charset=UTF-8"
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
<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
function post(){
	
	$('#dg').datagrid({
		url:"searchemployee",
		type:"post",
		queryParams: {
			"name":$('#name').val(),
			"dname":$('#dname').val(),
		}
	});

}	
</script>
<body class="easyui-layout">
	<div data-options="region:'center',fit:'true'"
		style="padding: 5px; background: #eee;">
		<!--     中间容器 -->
		<div data-options="fit:'true'"
			style="background-color: white; width: 100%; height: 100%">
			<div data-options="title:'North Title',fit:'true'"
				style="background: #eee; border: 1px solid rgb(149, 182, 231);">
				<!--     搜索框   -->
				姓名: <input id="name" type="text" /> 
				所属部门:<select id="dname" class="easyui-combobox" name="dName" style="width:300px;">
						<option >全部</option>
						<%	
							Dao dao = new Dao();
							List<Department> list2 = dao.getAllDepartment(); 
							for (int i=0;i < list2.size();i++){
						%>
							<option ><%=list2.get(i).getDname() %></option>						
						<% } %>
						</select> 
				<a id="btn"  class="easyui-linkbutton" data-options="iconCls:'icon-search',text:'搜索'" onclick="post()"></a>
			</div>

			<div class="page-content" style="padding-top: 10px;">
				<table id="dg" class="easyui-datagrid" style="width: 100%; height: 300px"
			data-options="url:'searchemployee',pagination:true,striped:true">
					<thead>
						<tr data-options="width: 100%">
							<th field="ck" checkbox="true" style="width: 9%"></th>
							<th data-options="field:'name'" style="width: 5%">姓名</th>
							<th data-options="field:'sex'" style="width: 5%">性别</th>
							<th data-options="field:'telephone'" style="width: 9%">手机号码</th>
							<th data-options="field:'email'" style="width: 9%">邮箱</th>
							<th data-options="field:'pnameBypid'" style="width: 10%">职位</th>
							<th data-options="field:'education'" style="width: 10%">学历</th>
							<th data-options="field:'idnumber'" style="width: 10%">身份证号码</th>
							<th data-options="field:'dnameBydid'" style="width: 10%">部门</th>
							<th data-options="field:'address'" style="width: 10%">联系地址</th>
							<th data-options="field:'time'" style="width: 9%">建档日期</th>
						</tr>
					</thead>
					 <tbody>   
          				</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>