package com.xc.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xc.dao.Dao;

public class AddbulletinService extends HttpServlet{
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
		int nid = dao.getMaxNid();
		if(nid == 0) {
			nid = 1;
		}else {
			nid++;
		}
		HttpSession session = req.getSession();
		String uid = session.getAttribute("id").toString();
		String bname = req.getParameter("bname");
		String content = req.getParameter("content");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String time = df.format(new Date());
		dao.adddbulletin(nid, bname, content,time,uid);	
}

}
