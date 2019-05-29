package com.xc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xc.service.DepartmentService;
import com.xc.service.PositionService;

public class SearchPositionController extends HttpServlet{
private PositionService positionService = new PositionService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");		
		String jobname = req.getParameter("jobname");
		if(jobname == null) {
			PrintWriter out = resp.getWriter();
			out.write(positionService.getPosition().toString());
			out.flush();
			out.close();
		}else {
			PrintWriter out = resp.getWriter();
			out.write(positionService.searchPosition(jobname).toString());
			out.flush();
			out.close();
		}		
	}
}
