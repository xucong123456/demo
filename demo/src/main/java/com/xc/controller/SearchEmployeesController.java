package com.xc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xc.service.BulletinService;
import com.xc.service.EmployeesService;

public class SearchEmployeesController extends HttpServlet{
private EmployeesService employeesService = new EmployeesService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");		
		String name = req.getParameter("name");
		String dname = req.getParameter("dname");	
			PrintWriter out = resp.getWriter();
			out.write(employeesService.searchEmployees(name, dname).toString());
			out.flush();
			out.close();		
	}
}
