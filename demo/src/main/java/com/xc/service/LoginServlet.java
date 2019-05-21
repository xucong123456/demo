package com.xc.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		HttpSession session = request.getSession();
//		//在需要保存用户数据时，服务器程序可以把用户数据写到用户浏览器独占的session中，
//		//当用户使用浏览器访问其它程序时，其它程序可以从用户的session中取出该用户的数据，为用户服务。
//		session.setAttribute("name", request.getParameter("name"));
//		//方法的意思就是类似于键值对进行存放，其中request.getParameter（）方法是index.jsp里面的内容，输入框的值
//		response.sendRedirect("Login.jsp");
//		//对服务器的响应进行重定向到success.jsp文件
		req.setCharacterEncoding("UTF-8"); 
		resp.setCharacterEncoding("UTF-8"); 
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		if (name.equals("123") && pass.equals("123")) {
			resp.sendRedirect("main.jsp");
		}else {
			System.out.println("登录失败");
		}
	}
	
	
}
