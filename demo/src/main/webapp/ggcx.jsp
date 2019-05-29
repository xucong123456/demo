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
         
    <div data-options="region:'center',title:'当前位置：公告管理 > 公告查询'" style="padding:5px;background:#eee;">
    <div id="p" class="easyui-panel"      
        style="width:100%;height:50px;background:#fafafa;padding:5px;"   
        data-options="iconCls:'icon-save',closable:true,    
                collapsible:true,minimizable:true,maximizable:true,noheader:true,edge:10">   
    <table>
    	<tr>
    		<td> 公告日期：</td>
    		<td><input id="time" class="easyui-validatebox" data-options="required:false" /></td>
            <td><a id="btn"  class="easyui-linkbutton" data-options="iconCls:'icon-search',text:'搜索'" onclick="post()"></a></td>           
    	</tr>
    </table>
</div> 
<div id="xx"  style="width:100%;height:90%;background:#fafafa;margin-top:10px">

<table class="easyui-datagrid" id="dg" data-options="url:'searchbulletin',pagination:true,striped:true">   
    <thead>
			<tr data-options="width: 100%">
				<th field="ck" checkbox="true" style="width: 9%"></th>
				<th data-options="field:'bname'" style="width: 23%">公告名称</th>
				<th data-options="field:'content'" style="width: 23%">公告内容</th>
				<th data-options="field:'time'" style="width: 23%">创建时间</th>
				<th data-options="field:'uid'" style="width: 23%">公告人</th>
				<!-- <th data-options="field:'operate'" style="width: 15%">操作</th>
				<th data-options="field:'education'" style="width: 15%">预览</th> -->
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
			url:"searchbulletin",
			type:"post",
			queryParams: {
				"time":$('#time').val(),
			}
		});

	}
</script> 
</body>
</html>