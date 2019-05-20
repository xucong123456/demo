package com.xc;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class HelloServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8"); 
		//设置字符集
		HttpSession session = request.getSession();
		//在需要保存用户数据时，服务器程序可以把用户数据写到用户浏览器独占的session中，
		//当用户使用浏览器访问其它程序时，其它程序可以从用户的session中取出该用户的数据，为用户服务。
		session.setAttribute("name", request.getParameter("name"));
		//方法的意思就是类似于键值对进行存放，其中request.getParameter（）方法是index.jsp里面的内容，输入框的值
		response.sendRedirect("success.jsp");
		//对服务器的响应进行重定向到success.jsp文件
	}
}
