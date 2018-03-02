package com.example.myspringboot.entity;
import java.io.Serializable;
public class Dormitory implements Serializable{
	private int dormitory_id;
	private String dormitory_number;
	private String room_number;
	private int tnumber;
	private int left_number;
	private int flag;
	public int getDormitory_id() {
		return dormitory_id;
	}
	public void setDormitory_id(int dormitory_id) {
		this.dormitory_id = dormitory_id;
	}
	public String getDormitory_number() {
		return dormitory_number;
	}
	public void setDormitory_number(String dormitory_number) {
		this.dormitory_number = dormitory_number;
	}
	public String getRoom_number() {
		return room_number;
	}
	public void setRoom_number(String room_number) {
		this.room_number = room_number;
	}
	public int getTnumber() {
		return tnumber;
	}
	public void setTnumber(int tnumber) {
		this.tnumber = tnumber;
	}

	public int getLeft_number() {
		return left_number;
	}
	public void setLeft_number(int left_number) {
		this.left_number = left_number;
	}

	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
}
