package com.xc.service;

import java.util.List;

import com.xc.dao.GetMenusDao;
import com.xc.model.Menu;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ShowMenuService1 {
	 GetMenusDao   gdao = new GetMenusDao();
	/**
	 * 获取树组件所要求的json数据结构
	 * @return
	 */
	 //若是管理员加载的菜单
	public JSONArray getMenus() {
		JSONArray  tree = new JSONArray();
		//XXX系统根节点固定
		JSONObject  root = new JSONObject();
		root.put("id", 0);
		root.put("text", "功能列表");
		//从这里开始构建一级到二级菜单
		List<Menu> first_m = gdao.getFirstMenu();
        //转换为json数组
		JSONArray  first_ms = JSONArray.fromObject(first_m);
        //根据一级菜单循环加载对应的二级菜单数据
		for (int i = 0; i < first_ms.size(); i++) {
			JSONObject  f_m = first_ms.getJSONObject(i);
			List<Menu>  s_m = gdao.getSecondMenuFromByPid(f_m.getInt("id"));
			JSONArray  smjson = JSONArray.fromObject(s_m);
			for (int j = 0; j < smjson.size(); j++) {
				JSONObject sm = smjson.getJSONObject(j);
				sm.put("state", "open");
				JSONObject attr = new JSONObject();
				attr.put("menupath", sm.getString("menuPath"));
				sm.put("attributes", attr);
			}
			 f_m.put("children", smjson);
  		}
		root.put("children", first_ms);
		tree.add(root);
		return tree;
	}
	//若是普通用户的话加载的菜单
	public JSONArray getMenus1() {
		JSONArray  tree = new JSONArray();
		//XXX系统根节点固定
		JSONObject  root = new JSONObject();
		root.put("id", 0);
		root.put("text", "功能列表");
		//从这里开始构建一级到二级菜单
		List<Menu> first_m = gdao.getFirstMenu();
        //转换为json数组
		JSONArray  first_ms = JSONArray.fromObject(first_m);
        //根据一级菜单循环加载对应的二级菜单数据
		for (int i = 0; i < first_ms.size(); i++) {
			JSONObject  f_m = first_ms.getJSONObject(i);
			List<Menu>  s_m = gdao.getSecondMenu1FromByPid(f_m.getInt("id"));
			JSONArray  smjson = JSONArray.fromObject(s_m);
			for (int j = 0; j < smjson.size(); j++) {
				JSONObject sm = smjson.getJSONObject(j);
				sm.put("state", "open");
				JSONObject attr = new JSONObject();
				attr.put("menupath", sm.getString("menuPath"));
				sm.put("attributes", attr);
			}
			 f_m.put("children", smjson);
  		}
		root.put("children", first_ms);
		tree.add(root);
		return tree;
	}
}
