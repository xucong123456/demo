package com.xc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xc.service.BulletinService;
import com.xc.service.DepartmentService;

public class SearchBulletinController extends HttpServlet{
private BulletinService bulletinService = new BulletinService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");		
		String time = req.getParameter("time");
		if(time == null) {
			PrintWriter out = resp.getWriter();
			out.write(bulletinService.getBulletin().toString());
			out.flush();
			out.close();
		}else {
			PrintWriter out = resp.getWriter();
			out.write(bulletinService.searchBulletin(time).toString());
			out.flush();
			out.close();
		}		
	}
}
