package com.xc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xc.model.Bulletin;
import com.xc.model.Department;
import com.xc.model.Employee;
import com.xc.model.Position;
import com.xc.model.User;
import com.xc.util.JDBC;

public class Dao {
	private JDBC jdbc = new JDBC();
	private Connection conn;
	private PreparedStatement stmt;

	private void check() {
		try {
			if (conn == null || conn.isClosed()) {
				conn = jdbc.getConnection();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Dao() {

	}
	
	//通过用户uid得到uname
	public String returnUnameByuid(String uid) {
		check();
		String sql = "select uname from tb_users where uid = '" + uid + "'";
		try {
			PreparedStatement stmt1 = conn.prepareStatement(sql);
			ResultSet rs = stmt1.executeQuery();
			if (rs.next()) {
				return rs.getString("uname");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//通过UID来返回给用户权限
	public String returnPowerByuid(String uid) {
		check();
		String sql = "select power from tb_users where uid = '" + uid + "'";
		try {
			PreparedStatement stmt1 = conn.prepareStatement(sql);
			ResultSet rs = stmt1.executeQuery();
			if (rs.next()) {
				return rs.getString("power");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	} 

	// 判断登录是否成功
	public Boolean isright(String uid, String password) throws SQLException {
		check();
		String sql = "select * from tb_users where uid = '" + uid + "' and password ='" + password + "'";
		stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			conn.close();
			return true;
		} else {
			conn.close();
			return false;
		}
	}

	// 判断用户是否存在
	public Boolean findusers(String uid) throws SQLException {
		check();
		String sql = "select * from tb_users where uid = '" + uid + "'";
		stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			conn.close();
			return true;
		} else {
			return false;
		}
	}

	// 添加用户信息
	public Boolean addusers(String uid, String uname, String password, int state, String time, String power)
			throws SQLException {
		check();
		boolean is = findusers(uid);
		String sql = "insert into tb_users (uid,uname,password,state,time,power) values('" + uid + "','" + uname + "','"
				+ password + "','" + state + "','" + time + "','" + power + "')";
		stmt = conn.prepareStatement(sql);
		if (!is) {
			stmt.executeUpdate();
			conn.close();
			return true;
		} else
			return false;
	}

	// 删除用户
	public Boolean deleteusers(String uid, String password) throws SQLException {
		String sql = "";
		boolean is = isright(uid, password);
		check();
		if (is) {
			System.out.println("123");
			sql = "delete from tb_users where uid = '" + uid + "'";
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			conn.close();
			return true;
		} else
			return false;
	}

	// 查找员工
	public List<Employee> getAllEmployees(String name, String dname) {
		List<Employee> list_employee = new ArrayList<Employee>();
		String sql = "";
		int did = 0;
		did = returnDidByname(dname);
		check();
		if (name == null && did == 0) {
			sql = "select * from tb_employees";
		} else if (name == null) {
			if (dname.equals("全部")) {
				sql = "select * from tb_employees";
			} else {
				sql = "select * from tb_employees where did = '" + did + "'";
			}
		} else {
			if (name.equals("")) {
				if (dname.equals("全部")) {
					sql = "select * from tb_employees";
				} else {
					sql = "select * from tb_employees where did = '" + did + "'";
				}
			} else {
				if (dname.equals("全部")) {
					sql = "select * from tb_employees where name = '" + name + "'";
				} else {
					sql = "select * from tb_employees where name = '" + name + "' and did = '" + did + "'";
				}
			}

		}
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				int pid = rs.getInt("pid");
				employee.setName(rs.getString("name"));
				employee.setSex(rs.getString("sex"));
				employee.setTelephone(rs.getString("telephone"));
				employee.setEmail(rs.getString("email"));
				String pname = returnJobnameBypid(pid);
				employee.setPnameBypid(pname);
				employee.setEducation(rs.getString("education"));
				employee.setIdnumber(rs.getString("idnumber"));
				String jobname = returnDnameBydid(did);
				employee.setDnameBydid(jobname);
				employee.setAddress(rs.getString("address"));
				employee.setTime(rs.getString("time"));
				list_employee.add(employee);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_employee;
	}

	// 查询用户
	/**
	 * @exception 通过用户名和权限查找用户的list集合
	 * @return list
	 * 
	 **/
	public List<User> getAllUser(String uName, String power) {
		check();
		List<User> list_user = new ArrayList<User>();
		String sql = "";
		if (uName == null && power == null) {
			sql = "select * from tb_users";
		} else if (uName == null) {
			if (power.equals("全部")) {
				sql = "select * from tb_users";
			} else {
				sql = "select * from tb_users where power = '" + power + "'";
			}
		} else {
			if (uName.equals("")) {
				if (power.equals("全部")) {
					sql = "select * from tb_users";
				} else {
					sql = "select * from tb_users where power = '" + power + "'";
				}
			} else {
				if (power.equals("全部")) {
					sql = "select * from tb_users where uname = '" + uName + "'";
				} else {
					sql = "select * from tb_users where uname = '" + uName + "' and power = '" + power + "'";
				}
			}

		}
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setUid(rs.getString("uid"));
				user.setUname(rs.getString("uname"));
				user.setPassword(rs.getString("password"));
				user.setState(rs.getString("state"));
				user.setTime(rs.getString("time"));
				user.setPower(rs.getString("power"));
				list_user.add(user);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list_user;
	}

	// 查询部门所有信息
	public List<Department> getAllDepartment() {
		check();
		List<Department> list_department = new ArrayList<Department>();
		String sql = "select * from tb_department";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Department department = new Department();
				department.setDid(rs.getInt("did"));
				department.setDname(rs.getString("dname"));
				department.setDinfo(rs.getString("dinfo"));
				list_department.add(department);
			}
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_department;
	}

	// 根据部门名称查询部门
	public List<Department> getAllDepartment(String dName) {
		check();
		List<Department> list_department = new ArrayList<Department>();
		String sql = "select * from tb_department where dname = '" + dName + "'";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Department department = new Department();
				department.setDid(rs.getInt("did"));
				department.setDname(rs.getString("dname"));
				department.setDinfo(rs.getString("dinfo"));
				list_department.add(department);
			}
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_department;
	}

	// 得到tb_department表里面的did的最大值
	public int getMaxDid() {
		check();
		String sql = "select max(did) as maxDid from tb_department";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("maxDid");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 得到tb_position表里面的did的最大值
	public int getMaxDid1() {
		check();
		String sql = "select max(pid) as maxPid from tb_position";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("maxPid");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 得到tb_employees表里面的did的最大值
	public int getMaxDid2() {
		check();
		String sql = "select max(eid) as maxEid from tb_employees";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("maxEid");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 得到tb_bulletin表里面的nid的最大值
	public int getMaxNid() {
		check();
		String sql = "select max(nid) as maxNid from tb_bulletin";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("maxNid");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 添加部门
	public Boolean adddepartment(int did, String dname, String detail) {
		check();
		String sql = "insert into tb_department values( '" + did + "' ,'" + dname + "','" + detail + "')";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 判断部门是否存在

	public Boolean finddepartment(String dname) {
		check();
		String sql = "select * from tb_department where dname = '" + dname + "'";
		ResultSet rs;
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			if (rs.next()) {
				conn.close();
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// 删除部门
	public Boolean deletepartment(String dname) throws SQLException {
		String sql = "delete from tb_department where dname = '" + dname + "'";
		Boolean is = finddepartment(dname);
		check();
		stmt = conn.prepareStatement(sql);
		if (is) {
			stmt.executeUpdate();
			conn.close();
			return true;
		} else
			return false;
	}

	// 添加职位
	public Boolean addposition(int pid, String jobname, String jobinfo) {
		check();
		String sql = "insert into tb_position values( '" + pid + "' ,'" + jobname + "','" + jobinfo + "')";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 判断职位是否存在

	public Boolean findposition(String jobname) {
		check();
		String sql = "select * from tb_position where jobname = '" + jobname + "'";
		ResultSet rs;
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// 查询职位所有信息
	public List<Position> getAllPosition() {
		check();
		List<Position> list_Position = new ArrayList<Position>();
		String sql = "select * from tb_position";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Position position = new Position();
				position.setPid(rs.getInt("pid"));
				position.setJobname(rs.getString("jobname"));
				position.setJobinfo(rs.getString("jobinfo"));
				list_Position.add(position);
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_Position;
	}

	// 根据职位名称查询职位
	public List<Position> getAllPosition(String jobName) {
		check();
		List<Position> list_Position = new ArrayList<Position>();
		String sql = "select * from tb_position where jobname = '" + jobName + "'";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Position position = new Position();
				position.setPid(rs.getInt("pid"));
				position.setJobname(rs.getString("jobname"));
				position.setJobinfo(rs.getString("jobinfo"));
				list_Position.add(position);
			}
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_Position;
	}

	// 删除职位
	public Boolean deleteposition(String jobname) throws SQLException {
		Boolean is = findposition(jobname);
		check();
		String sql = "delete from tb_position where jobname = '" + jobname + "'";
		if (is) {
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			conn.close();
			return true;
		} else
			return false;
	}

	// 通过部门名字返回部门id
	public int returnDidByname(String dname) {
		check();
		String sql = "select did from tb_department where dname = '" + dname + "'";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("did");
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	// 通过职位名字返回部门id
	public int returnPidByname(String jobname) {
		check();
		String sql = "select pid from tb_position where jobname = '" + jobname + "'";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("pid");
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	// 添加员工
	public Boolean addemployees(int eid, String name, String idnumber, String sex, int pid, String education,
			String email, String telephone, String phonenumber, String political, String qq, String address,
			String postcode, String birth, String family, String major, String interests, int did, String remarks,
			String time) {
		check();
		String sql = "insert into tb_employees values( '" + eid + "' ,'" + name + "','" + idnumber + "','" + sex + "','"
				+ pid + "','" + education + "' ,'" + email + "' ,'" + telephone + "' ,'" + phonenumber + "' ,'"
				+ political + "' ," + "'" + qq + "','" + address + "','" + postcode + "','" + birth + "'," + "'"
				+ family + "','" + major + "','" + interests + "'," + "'" + did + "','" + remarks + "','" + time + "')";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 判断员工是否存在

	public Boolean findemployees(int eid) {
		check();
		String sql = "select * from tb_employees where eid = '" + eid + "'";
		ResultSet rs;
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			if (rs.next()) {
				conn.close();
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// 删除员工
	public Boolean deleteemployee(int eid) throws SQLException {
		String sql = "delete from tb_employees where eid = '" + eid + "'";
		Boolean is = findemployees(eid);
		check();
		stmt = conn.prepareStatement(sql);
		if (is) {
			stmt.executeUpdate();
			conn.close();
			return true;
		} else
			return false;
	}

	// 通过部门id返回部门名称
	public String returnDnameBydid(int did) {
		check();
		String sql = "select dname from tb_department where did = '" + did + "'";
		try {
			PreparedStatement stmt1 = conn.prepareStatement(sql);
			ResultSet rs = stmt1.executeQuery();
			if (rs.next()) {
				return rs.getString("dname");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 通过职位id返回职位名称
	public String returnJobnameBypid(int pid) {
		check();
		String sql = "select jobname from tb_position where pid = '" + pid + "'";
		try {
			PreparedStatement stmt1 = conn.prepareStatement(sql);
			ResultSet rs = stmt1.executeQuery();
			if (rs.next()) {
				return rs.getString("jobname");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 查询员工所有信息
	public List<Employee> getAllEmployee() {
		check();
		List<Employee> list_employee = new ArrayList<Employee>();
		String sql = "select * from tb_employees";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				int pid = rs.getInt("pid");
				employee.setName(rs.getString("name"));
				employee.setSex(rs.getString("sex"));
				employee.setTelephone(rs.getString("telephone"));
				employee.setEmail(rs.getString("email"));
				String pname = returnJobnameBypid(pid);
				employee.setPnameBypid(pname);
				employee.setEducation(rs.getString("education"));
				employee.setIdnumber(rs.getString("idnumber"));
				int did = rs.getInt("did");
				String jobname = returnDnameBydid(did);
				employee.setDnameBydid(jobname);
				employee.setAddress(rs.getString("address"));
				employee.setTime(rs.getString("time"));
				list_employee.add(employee);
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_employee;
	}

	// 添加公告
	public Boolean adddbulletin(int nid, String bname, String content, String time, String uid) {
		check();
		String sql = "insert into tb_bulletin values( '" + nid + "' ,'" + bname + "','" + content + "','" + time + "','"
				+ uid + "')";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 查询公告所有信息
	public List<Bulletin> getAllBulletin() {
		check();
		List<Bulletin> list_bulletin = new ArrayList<Bulletin>();
		String sql = "select * from tb_bulletin";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Bulletin bulletin = new Bulletin();
				bulletin.setNid(rs.getInt("nid"));
				bulletin.setBname(rs.getString("bname"));
				bulletin.setContent(rs.getString("content"));
				bulletin.setTime(rs.getString("time"));
				bulletin.setUid(rs.getString("uid"));
				list_bulletin.add(bulletin);
			}
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_bulletin;
	}

	// 根据公告时间查询公告
	public List<Bulletin> getAllBulletin(String time) {
		check();
		List<Bulletin> list_bulletin = new ArrayList<Bulletin>();
		String sql = "select * from tb_bulletin where time = '" + time + "'";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Bulletin bulletin = new Bulletin();
				bulletin.setNid(rs.getInt("nid"));
				bulletin.setBname(rs.getString("bname"));
				bulletin.setContent(rs.getString("content"));
				bulletin.setTime(rs.getString("time"));
				bulletin.setUid(rs.getString("uid"));
				list_bulletin.add(bulletin);
			}
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_bulletin;
	}

}
