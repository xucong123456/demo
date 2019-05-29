package com.xc.model;

public class Bulletin {
	private int nid;
	private String bname;
	private String content;
	private String time;
	private String uid;
	
	public Bulletin() {
		
	}
	public Bulletin(int nid,String bname,String content,String time ,String uid){
		super();
		this.nid = nid;
		this.bname = bname;
		this.content = content;
		this.time =time;
		this.uid =uid;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
}
