package com.xc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xc.service.DepartmentService;
import com.xc.service.UserService;

public class SearchDepartmentController extends HttpServlet{
private DepartmentService deportmentService = new DepartmentService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");		
		String dname = req.getParameter("dname");
		if(dname == null) {
			PrintWriter out = resp.getWriter();
			out.write(deportmentService.getDepartment().toString());
			out.flush();
			out.close();
		}else {
			PrintWriter out = resp.getWriter();
			out.write(deportmentService.searchDepartment(dname).toString());
			out.flush();
			out.close();
		}		
	}
}
