package com.xc.model;

public class Department {
	private int did;
	private String dname;
	private String dinfo;
	
	public Department() {
		
	}
	public Department(int did,String dname,String dinfo){
		super();
		this.did = did;
		this.dname = dname;
		this.dinfo = dinfo;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDinfo() {
		return dinfo;
	}
	public void setDinfo(String dinfo) {
		this.dinfo = dinfo;
	}
	
	
}
