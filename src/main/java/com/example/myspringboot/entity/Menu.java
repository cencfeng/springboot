package com.example.myspringboot.entity;

import java.io.Serializable;

public class Menu implements Serializable{
	private int id;
	private String m_name;
	private String m_url;
	private int m_level;
	private int m_order;
	private int m_parentid;
	private int m_flag;
    
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_url() {
		return m_url;
	}
	public void setM_url(String m_url) {
		this.m_url = m_url;
	}
	public int getM_level() {
		return m_level;
	}
	public void setM_level(int m_level) {
		this.m_level = m_level;
	}
	public int getM_order() {
		return m_order;
	}
	public void setM_order(int m_order) {
		this.m_order = m_order;
	}
	public int getM_parentid() {
		return m_parentid;
	}
	public void setM_parentid(int m_parentid) {
		this.m_parentid = m_parentid;
	}
	public int getM_flag() {
		return m_flag;
	}
	public void setM_flag(int m_flag) {
		this.m_flag = m_flag;
	}
	
}
