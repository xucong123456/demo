package com.xc.model;

public class Position {
	private int pid;
	private String jobname;
	private String jobinfo;
	
	public Position() {
		
	}
	public Position(int pid,String jobname,String jobinfo){
		super();
		this.pid = pid;
		this.jobname = jobname;
		this.jobinfo = jobinfo;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getJobinfo() {
		return jobinfo;
	}
	public void setJobinfo(String jobinfo) {
		this.jobinfo = jobinfo;
	}
	
}
