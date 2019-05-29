package com.xc.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class MenuService extends HttpServlet {
	@SuppressWarnings("unchecked")
	public JSONArray getMenu() {
		JSONArray tree = new JSONArray();
		JSONObject root = new JSONObject();
		root.put("id", 0);
		root.put("text", "人力资源管理系统");

		// ------second menu
		// 完成用户管理的‘孩子’children1
		JSONObject A11 = new JSONObject();
		A11.put("id", 1);
		A11.put("text", "用户查询");
		A11.put("state", "open");
		JSONObject attr11 = new JSONObject();
		attr11.put("menupath", "a.jsp");
		A11.put("attributes", attr11);
		
		JSONObject A12 = new JSONObject();
		A12.put("id", 2);
		A12.put("text", "添加用户");
		A12.put("state", "open");
		JSONObject attr12 = new JSONObject();
		attr12.put("menupath", "b.jsp");
		A12.put("attributes", attr12);
		
		List children1 = new ArrayList();
		children1.add(A11);
		children1.add(A12);

		// 完成部门管理的‘孩子’children2
		JSONObject A21 = new JSONObject();
		A21.put("id", 1);
		A21.put("text", "部门查询");
		A21.put("state", "open");
		JSONObject attr21 = new JSONObject();
		attr21.put("menupath", "c.jsp");
		A21.put("attributes", attr21);
		// --------
		JSONObject A22 = new JSONObject();
		A22.put("id", 2);
		A22.put("text", "添加部门");
		A22.put("state", "open");
		JSONObject attr22 = new JSONObject();
		attr22.put("menupath", "d.jsp");
		A22.put("attributes", attr22);
		List children2 = new ArrayList();
		children2.add(A21);
		children2.add(A22);

		// 完成职位管理的‘孩子’children3
		JSONObject A31 = new JSONObject();
		A31.put("id", 1);
		A31.put("text", "职位查询");
		A31.put("state", "open");
		JSONObject attr31 = new JSONObject();
		attr31.put("menupath", "e.jsp");
		A31.put("attributes", attr31);
		// --------
		JSONObject A32 = new JSONObject();
		A32.put("id", 2);
		A32.put("text", "添加职位");
		A32.put("state", "open");
		JSONObject attr32 = new JSONObject();
		attr32.put("menupath", "f.jsp");
		A32.put("attributes", attr32);
		List children3 = new ArrayList();
		children3.add(A31);
		children3.add(A32);

		// 完成员工管理的‘孩子’children4
		JSONObject A41 = new JSONObject();
		A41.put("id", 1);
		A41.put("text", "员工查询");
		A41.put("state", "open");
		JSONObject attr41 = new JSONObject();
		attr41.put("menupath", "b.jsp");
		A41.put("attributes", attr41);
		// --------
		JSONObject A42 = new JSONObject();
		A42.put("id", 2);
		A42.put("text", "添加员工");
		A42.put("state", "open");
		JSONObject attr42 = new JSONObject();
		attr42.put("menupath", "g.jsp");
		A42.put("attributes", attr42);
		List children4 = new ArrayList();
		children4.add(A41);
		children4.add(A42);

		// 完成公告管理的‘孩子’children5
		JSONObject A51 = new JSONObject();
		A51.put("id", 1);
		A51.put("text", "公告查询");
		A51.put("state", "open");
		// --------
		JSONObject attr51 = new JSONObject();
		attr51.put("menupath", "h.jsp");
		A51.put("attributes", attr51);
		JSONObject A52 = new JSONObject();
		A52.put("id", 2);
		A52.put("text", "添加公告");
		A52.put("state", "open");
		JSONObject attr52 = new JSONObject();
		attr52.put("menupath", "i.jsp");
		A52.put("attributes", attr52);
		List children5 = new ArrayList();
		children5.add(A51);
		children5.add(A52);

		// 完成下载中心的‘孩子’children6
		JSONObject A61 = new JSONObject();
		A61.put("id", 1);
		A61.put("text", "文档查询");
		A61.put("state", "open");
		// --------
		JSONObject A62 = new JSONObject();
		A62.put("id", 2);
		A62.put("text", "上传文档");
		A62.put("state", "open");
		List children6 = new ArrayList();
		children6.add(A61);
		children6.add(A62);

		// --------first menu
		JSONObject A1 = new JSONObject();
		A1.put("id", 1);
		A1.put("text", "用户管理");
		A1.put("state", "closed");
		A1.put("children", children1);
		JSONObject A2 = new JSONObject();
		A2.put("id", 2);
		A2.put("text", "部门管理");
		A2.put("state", "closed");
		A2.put("children", children2);
		JSONObject A3 = new JSONObject();
		A3.put("id", 3);
		A3.put("text", "职位管理");
		A3.put("state", "closed");
		A3.put("children", children3);
		JSONObject A4 = new JSONObject();
		A4.put("id", 4);
		A4.put("text", "员工管理");
		A4.put("state", "closed");
		A4.put("children", children4);
		JSONObject A5 = new JSONObject();
		A5.put("id", 5);
		A5.put("text", "公告管理");
		A5.put("state", "closed");
		A5.put("children", children5);
		JSONObject A6 = new JSONObject();
		A6.put("id", 6);
		A6.put("text", "下载中心");
		A6.put("state", "closed");
		A6.put("children", children6);
		List children = new ArrayList();
		children.add(A1);
		children.add(A2);
		children.add(A3);
		children.add(A4);
		children.add(A5);
		children.add(A6);
		root.put("children", children);
		tree.add(root);
		return tree;
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 有一个服务提供tree的数据
		String tree = getMenu().toString();
		resp.setCharacterEncoding("utf8");
		PrintWriter pw = resp.getWriter();
		pw.write(tree);
		pw.flush();
		pw.close();
	}
}
