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

public class AddEmployeeService extends HttpServlet{
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
		int eid  = dao.getMaxDid2();
		String name = req.getParameter("ename");
		String idnumber = req.getParameter("idnumber");
		String sex = req.getParameter("sex");
		String jobname = req.getParameter("jobname");
		//通过jobname获取pid
		int pid = dao.returnPidByname(jobname);
		
		String education = req.getParameter("education");
		String email = req.getParameter("email");
		String telephone = req.getParameter("telephone");
		String phonenumber = req.getParameter("phonenumber");
		String political = req.getParameter("political");
		String qq = req.getParameter("qq");
		String address = req.getParameter("address");
		String postcode = req.getParameter("postcode");
		String birth = req.getParameter("birth");
		String family = req.getParameter("family");
		String major = req.getParameter("major");
		String interests = req.getParameter("interests");
		String dname = req.getParameter("dName");
		//通过部门名称得到did
		int did = dao.returnDidByname(dname);
		String remarks = req.getParameter("remarks");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String time = df.format(new Date());
		dao.addemployees(eid, name, idnumber, sex, pid, education, 
				email, telephone, phonenumber, political, qq, 
				address, postcode, birth, family, major, interests, 
				did, remarks, time);
	}
}
