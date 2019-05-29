<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
    <div id="p" class="easyui-panel"      
        style="width:100%;height:250px;background:#fafafa;padding:5px;"   
        data-options="iconCls:'icon-save',closable:true,    
                collapsible:true,minimizable:true,maximizable:true,noheader:true,edge:10">   
    <table>
    	<tr>
    		<td> 姓名:</td>
    		<td><input id="vv" class="easyui-validatebox" data-options="required:false,validType:'email'" /></td>
    		<td>&nbsp;</td>
    		<td>&nbsp;</td>
    		<td>&nbsp;</td>
    		<td>状态：</td>
    	     <td><select id="cc" class="easyui-combobox" name="dept" style="width:100px;"> 		  
    <option value="aa">管理员</option>   
    <option>bitem2</option>   
    <option>bitem3</option>   
    <option>ditem4</option>   
    <option>eitem5</option> 		  				  
           </select> </td>          
    	</tr>
    	<tr>
    	   <td>登录名:</td>
    		<td><input id="vv" class="easyui-validatebox" data-options="required:false,validType:'email'" /></td>
    		<td>&nbsp;</td>
    		<td>&nbsp;</td>
    		<td>&nbsp;</td>

    	</tr>
    	<tr>&nbsp;</tr>
    	<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
    	<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
    	<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
    	<tr>
    	<td><button>修改</button></td>
    	    <td>&nbsp;</td>
    		<td>&nbsp;</td>
    		
    	<td><button>取消</button></td>
    	</tr>
    </table>
</div> 

</body>
</html>