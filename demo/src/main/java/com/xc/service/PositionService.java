package com.xc.service;

import java.util.List;

import com.xc.dao.Dao;
import com.xc.model.Department;
import com.xc.model.Position;

import net.sf.json.JSONObject;

public class PositionService {
	private Dao dao = new Dao();

	public JSONObject searchPosition(String jobname) {
		JSONObject tree = new JSONObject();
		List<Position> list = dao.getAllPosition(jobname);
		tree.put("total", list.size());
		tree.put("rows", list);
		return tree;
	}
	
	public JSONObject getPosition() {
		JSONObject tree = new JSONObject();
		List<Position> list = dao.getAllPosition();
		tree.put("total", list.size());
		tree.put("rows", list);
		return tree;
	}
}
