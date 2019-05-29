package com.xc.service;

import java.util.List;

import com.xc.dao.Dao;
import com.xc.model.Department;
import com.xc.model.User;

import net.sf.json.JSONObject;

public class DepartmentService {
	private Dao dao = new Dao();

	public JSONObject searchDepartment(String dname) {
		JSONObject tree = new JSONObject();
		List<Department> list = dao.getAllDepartment(dname);
		tree.put("total", list.size());
		tree.put("rows", list);
		return tree;
	}
	
	public JSONObject getDepartment() {
		JSONObject tree = new JSONObject();
		List<Department> list = dao.getAllDepartment();
		tree.put("total", list.size());
		tree.put("rows", list);
		return tree;
	}
}
