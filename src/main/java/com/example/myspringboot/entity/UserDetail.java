package com.example.myspringboot.entity;

import java.io.Serializable;

public class UserDetail implements Serializable{

	private String username;
	private String name;
	private int dept_id;
	private int dormitory_id;
	private int position_id;
	private int sex;
	private int location;
	private String tel;
	private String phone;
	private String email;
	private String ic_card;
	private Dept dept;
	private Dormitory dormitory;
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Dormitory getDormitory() {
		return dormitory;
	}
	public void setDormitory(Dormitory dormitory) {
		this.dormitory = dormitory;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public int getDormitory_id() {
		return dormitory_id;
	}
	public void setDormitory_id(int dormitory_id) {
		this.dormitory_id = dormitory_id;
	}
	public int getPosition_id() {
		return position_id;
	}
	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIc_card() {
		return ic_card;
	}
	public void setIc_card(String ic_card) {
		this.ic_card = ic_card;
	}
	
	
}
