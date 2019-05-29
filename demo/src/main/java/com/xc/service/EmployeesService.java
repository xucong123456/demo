package com.xc.service;

import java.util.List;

import com.xc.dao.Dao;
import com.xc.model.Bulletin;
import com.xc.model.Employee;

import net.sf.json.JSONObject;

public class EmployeesService {
	private Dao dao = new Dao();

	public JSONObject searchEmployees(String name,String dname) {
		JSONObject tree = new JSONObject();
		List<Employee> list = dao.getAllEmployees(name , dname);
		tree.put("total", list.size());
		tree.put("rows", list);
		return tree;
	}
	
	public JSONObject getEmployees() {
		JSONObject tree = new JSONObject();
		List<Employee> list = dao.getAllEmployee();
		tree.put("total", list.size());
		tree.put("rows", list);
		return tree;
	}
}
