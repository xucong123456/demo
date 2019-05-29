<%@ page language="java" import="java.util.*,com.xc.model.*,com.xc.dao.*" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人事管理系统——添加员工</title>
<link rel="stylesheet" type="text/css" href="themes/gray/easyui.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div id="p" class="easyui-panel" title="当前位置：员工管理 > 添加员工"
		style="width: full; height: full; padding: 10px; background: #fafafa;">
		<form id="form" action="addEmployee",method="post">
			<table>
				<tr>
					<td>姓&nbsp;&nbsp;名<font color="red" size="4px"></font>:</td>
					<td><input name="ename" class="easyui-textbox"
						style="width: 300px"></td>
					<td>身份证号码<font color="red" size="4px"></font>:</td>
					<td><input name="idnumber" class="easyui-textbox"
						style="width: 300px"></td>
				</tr>
				<tr>
					<td>性&nbsp;&nbsp;别<font color="red" size="4px"></font>:</td>
					<td><select class="easyui-combobox" name="sex"
						style="width: 300px;">
							<option >男</option>
							<option >女</option>
					</select></td>
					<td>职&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;位<font color="red" size="4px"></font>:</td>
					<td><select class="easyui-combobox" name="jobname"
						style="width: 300px;">
						<%	
							Dao dao = new Dao();
							List<Position> list = dao.getAllPosition(); 
							for (int i=0;i < list.size();i++){
						%>
							<option ><%= list.get(i).getJobname()%></option>						
						<% } %>
						</select>
						</td>
				</tr>
				<tr>
					<td>学&nbsp;&nbsp;历<font color="red" size="4px"></font>:</td>
					<td><input name="education" class="easyui-textbox"
						style="width: 300px"></td>
					<td>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱<font color="red" size="4px"></font>:</td>
					<td><input name="email" class="easyui-textbox"
						style="width: 300px"></td>
				</tr>
				<tr>
					<td>手&nbsp;&nbsp;机<font color="red" size="4px"></font>:</td>
					<td><input name="telephone" class="easyui-textbox"
						style="width: 300px"></td>
					<td>电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话:</td>
					<td><input name="phonenumber" class="easyui-textbox"
						style="width: 300px"></td>
				</tr>
				<tr>
					<td>政治面貌:</td>
					<td><input name="political" class="easyui-textbox"
						style="width: 300px"></td>
					<td>QQ号码<font color="red" size="4px"></font>:</td>
					<td><input name="qq" class="easyui-textbox"
						style="width: 300px"></td>
				</tr>
				<tr>
					<td>联系地址<font color="red" size="4px"></font>:</td>
					<td><input name="address" class="easyui-textbox"
						style="width: 300px"></td>
					<td>邮政编码:</td>
					<td><input name="postcode" class="easyui-textbox"
						style="width: 300px"></td>
				</tr>
				<tr>
					<td>出生日期<font color="red" size="4px"></font>:</td>
					<td><input name="birth" class="easyui-textbox"
						style="width: 300px"></td>
					<td>民&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;族<font color="red" size="4px"></font>:</td>
					<td><input name="family" class="easyui-textbox"
						style="width: 300px"></td>
				</tr>
				<tr>
					<td>专&nbsp;&nbsp;业:</td>
					<td><input name="major" class="easyui-textbox"
						style="width: 300px"></td>
					<td>爱&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;好:</td>
					<td><input name="interests" class="easyui-textbox"
						style="width: 300px"></td>
				</tr>
				<tr>
					<td>备&nbsp;&nbsp;注:</td>
					<td><input name="remarks" class="easyui-textbox"
						style="width: 300px"></td>
					<td>部&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;门<font color="red" size="4px"></font>:</td>
					<td><select class="easyui-combobox" name="dName" style="width:300px;">
							
						<%	
							List<Department> list1 = dao.getAllDepartment(); 
							for (int i=0;i < list1.size();i++){
						%>
							<option ><%=list1.get(i).getDname() %></option>						
						<% } %>
						</select>
						</td>
					</td>
				</tr>
			</table>
			<table border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td>&nbsp;&nbsp;&nbsp;<input type="submit" value="确定"/></td>
							<td>&nbsp;&nbsp;&nbsp;<input type="reset" value="取消"/></td>
						</tr>
				</table>	
		</form>
		<script type="text/javascript">
			function checkAdd() {
				if ($("[name='wName']").val() == '') {
					alert("姓名不能为空");
					return;
				}
				if ($("[name='education']").val() == '') {
					alert("学历不能为空");
					return;
				}
				if ($("[name='idNumber']").val() == '') {
					alert("身份证号不能为空");
					return;
				}
				if ($("[name='address']").val() == '') {
					alert("联系地址不能为空");
					return;
				}
				if ($("[name='birthday']").val() == '') {
					alert("生日不能为空");
					return;
				}
				if ($("[name='qq']").val() == '') {
					alert("qq不能为空");
					return;
				}
				if ($("[name='email']").val() == '') {
					alert("邮箱不能为空");
					return;
				}
				if ($("[name='family']").val() == '') {
					alert("民族不能为空");
					return;
				}
				if ($("[name='major']").val() == '') {
					alert("专业不能为空");
					return;
				}
				if ($("[name='mobilePhone']").val() == '') {
					alert("手机号码不能为空");
					return;
				}
			}
		</script>
</body>
</html>