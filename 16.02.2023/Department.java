package com.containemnt;

public class Department {
	
	private int id;
	private String deptName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String deptName) {
		super();
		this.id = id;
		this.deptName = deptName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + "]";
	}
	
	

}
