package com.xc.model;

public class Employee {
	private int eid;
	private String name;
	private String idnumber;
	private String sex;
	private int pid;
	private String education;
	private String email;
	private String phonenumber;
	private String telephone;
	private String political;
	private String qq;
	private String address;
	private String postcode;
	private String birth;	
	private String family;
	private String major;
	private String interests;
	private int did;
	private String remarks;
	private String time;
	private String pnameBypid;
	private String dnameBydid;
	
	public Employee(){
		
	}
	public Employee(int eid,String name,String idnumber,String sex,int pid,String education
			,String email,String phonenumber,String telephone,String political,String qq,String address
			,String postcode,String birth,String family,String major,String interests,int did
			,String remarks,String time,String pnameBypid,String dnameBydid) {
		this.eid = eid;
		this.name = name;
		this.idnumber = idnumber;
		this.sex = sex;
		this.pid = pid;
		this.education = education;
		this.email = email;
		this.phonenumber = phonenumber;
		this.telephone = telephone;
		this.political = political;
		this.qq = qq;
		this.address = address;
		this.postcode = postcode;
		this.birth = birth;
		this.family = family;
		this.major = major;
		this.interests = interests;
		this.did = did;
		this.remarks = remarks;
		this.time = time;
		this.pnameBypid = pnameBypid;
		this.dnameBydid = dnameBydid;
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPolitical() {
		return political;
	}
	public void setPolitical(String political) {
		this.political = political;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPnameBypid() {
		return pnameBypid;
	}
	public void setPnameBypid(String pnameBypid) {
		this.pnameBypid = pnameBypid;
	}
	public String getDnameBydid() {
		return dnameBydid;
	}
	public void setDnameBydid(String dnameBydid) {
		this.dnameBydid = dnameBydid;
	}
	

}
