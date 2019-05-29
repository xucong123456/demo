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

public class AdddepartmentService extends HttpServlet{
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
		int did = dao.getMaxDid();
		if(did == 0) {
			did = 1;
		}else {
			did++;
		}
		String dname = req.getParameter("dname");
		String dinfo = req.getParameter("detail");
		dao.adddepartment(did, dname, dinfo);	
}

}
