<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人事管理系统-公告管理</title>
</head>
<!-- import easyui-css -->
<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">
<!-- 引入easyu的js文件 -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
		<script type="text/javascript">
		
		 function submit(){
	        
	        /** 表单提交的校验 */
	       //$("#noticeForm").submit(function(){
	        	var title = $("#title");
	        	var content = $("#content");
	        	var msg = "";
	        	if ($.trim(title.val()) == ""){
					msg = "公告标题不能为空！";
					title.focus();
				}
	        	else if($.trim(title.val()).length <= 2){
	        		msg = "请输入两个字符以上的标题！";
	        		title.focus();
	        	}
	        	else if($.trim(content.val()) == ""){
	        		msg = "公告内容不能为空！";
	        		content.focus();
	        	}
	        	if (msg != ""){
					$.ligerDialog.error(msg);
					return false;
				}else{
					return true;
				}
	        	//$("#noticeForm").submit();
	        	
	        //});
	    }			
		</script>
</head>
	<body>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" style="background: #ADD8E6">
			 <tr><td height="10"></td></tr>
			 <tr>
			    <td width="15" height="32"><img src="" width="15" height="32"></td>
				<td class="main_locbg font2"><img src="">&nbsp;&nbsp;&nbsp;当前位置：公告管理  &gt;  修改公告</td>
				<td width="15" height="32"><img src="" width="15" height="32"></td>
			 </tr>
		</table>
	
		 <!-- 请求异常错误  -->
		<table width="100%" height="90%" border="0" cellpadding="10" cellspacing="0" class="main_tabbor" style="background: #E6E6FA">
		  	<tr valign="top">
			    <td>
			   
				  <!-- 隐藏表单，flag表示添加标记 -->
    	 			<input type="hidden" name="flag" value="2">
    	 			<input type="hidden" name="id" value="${notice.id }">
				  <table width="100%" border="0" cellpadding="0" cellspacing="10" class="main_tab">
					    <tr><td class="font3 fftd">
					                公告标题：<input type="text" name="title" size="30" id="title" value="参加会议通知"/>
					    	  <span style="color: #ff0000;"></span>
					    	</td>
					    </tr>
						<tr><td class="main_tdbor"></td></tr>
						
						<tr><td class="font3 fftd">公告内容：<br/>
							<textarea name="content" cols="88" rows="11" id="content" >今天有技术部有会议</textarea>
						</td></tr>
						<tr><td class="main_tdbor"></td></tr>
						
						<tr><td class="font3 fftd">
								<input type="button" onclick="submit()" value="修改">
								<input type="reset" value="重置">
						</td></tr>
						<tr><td class="main_tdbor"></td></tr>
					
				  </table>
				  
				</td>
		  	</tr>
		</table>
		<div style="height:10px;"></div>
	</body>
</html>