package com.xc.service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xc.dao.Dao;

public class AddPositionService extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8"); 
		resp.setCharacterEncoding("UTF-8"); 
		Dao dao =new Dao();
		int pid = dao.getMaxDid1();
		if(pid == 0) {
			pid = 1;
		}else {
			pid++;
		}
		String jobname = req.getParameter("jobname");
		String jobinfo = req.getParameter("jobinfo");
		dao.addposition(pid, jobname, jobinfo);	
}

}
