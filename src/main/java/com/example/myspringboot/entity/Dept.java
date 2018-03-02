package com.example.myspringboot.entity;

import java.io.Serializable;

public class Dept implements Serializable{

	private int dept_id;
	private String dept;
	private String dept_remark;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept_remark() {
		return dept_remark;
	}
	public void setDept_remark(String dept_remark) {
		this.dept_remark = dept_remark;
	}
	
	
}
