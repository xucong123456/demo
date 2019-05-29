package com.xc.service;

import java.util.List;

import com.xc.dao.Dao;
import com.xc.model.Bulletin;
import com.xc.model.Department;

import net.sf.json.JSONObject;

public class BulletinService {
	private Dao dao = new Dao();

	public JSONObject searchBulletin(String time) {
		JSONObject tree = new JSONObject();
		List<Bulletin> list = dao.getAllBulletin(time);
		tree.put("total", list.size());
		tree.put("rows", list);
		return tree;
	}
	
	public JSONObject getBulletin() {
		JSONObject tree = new JSONObject();
		List<Bulletin> list = dao.getAllBulletin();
		tree.put("total", list.size());
		tree.put("rows", list);
		return tree;
	}
}
