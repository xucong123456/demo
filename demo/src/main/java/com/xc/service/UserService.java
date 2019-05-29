package com.xc.service;

import java.util.ArrayList;
import java.util.List;

import com.xc.dao.Dao;
import com.xc.model.User;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class UserService {

	private Dao dao = new Dao();

	public JSONObject searchUser(String uname, String power) {
		JSONObject tree = new JSONObject();
		List<User> list = dao.getAllUser(uname, power);
		tree.put("total", list.size());
		tree.put("rows", list);
		return tree;
	}

}
