<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="themes/gray/easyui.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
</head>

<body class="easyui-layout">   
         
    <div data-options="region:'center',title:'当前位置：用户管理 > 用户查询'" style="padding:5px;background:#eee;">
    <div id="p" class="easyui-panel"      
        style="width:100%;height:50px;background:#fafafa;padding:5px;"   
        data-options="iconCls:'icon-save',closable:true,    
                collapsible:true,minimizable:true,maximizable:true,noheader:true,edge:10">   
    <table>
    	<tr>
    		<td> 用户名:</td>
    		<td><input id="uname" class="easyui-validatebox" data-options="required:false" /></td>
    		<td>用户权限</td>
    	  <td><select id="power" class="easyui-combobox" style="width:200px;"> 		  
    <option selected = "selected">全部</option>   
    <option>管理员</option>   
    <option>普通用户</option>    
           </select> </td>
            <td><a id="btn"  class="easyui-linkbutton" data-options="iconCls:'icon-search',text:'搜索'" onclick="post()"></a></td>           
    	</tr>
    </table>
</div> 
<div id="xx"  style="width:100%;height:90%;background:#fafafa;margin-top:10px">

<table class="easyui-datagrid" id="dg" data-options="url:'searchUser',pagination:true,striped:true">   
    <thead>   
        <tr>          
            <th data-options="field:'null'" style="width:10%;align:center;vertical-align:middle;" checkbox="true" ></th>   
            <th data-options="field:'uid'"style="width:15%;"fit="true"><h4 align="center">登录名</h4></th>   
            <th data-options="field:'password'"style="width:15%;"><h4 align="center">密码</h4></th>
            <th data-options="field:'uname'"style="width:15%;"><h4 align="center">用户名</h4></th>
            <th data-options="field:'state'"style="width:15%;"><h4 align="center">状态</h4></th>
            <th data-options="field:'time'"style="width:15%;"><h4 align="center">创建时间</h4></th>
            <th data-options="field:'power'"style="width:14%;"><h4 align="center">权限</h4></th>  
        </tr>   
    </thead>   
    <tbody>   
          
    </tbody>   
</table>
 	
</div>
</div>  
<script type="text/javascript">
	function post(){
	
		$('#dg').datagrid({
			url:"searchUser",
			type:"post",
			queryParams: {
				"uname":$('#uname').val(),
				"power":$('#power').val(),
			}
		});

	}
</script> 
</body>
</html>