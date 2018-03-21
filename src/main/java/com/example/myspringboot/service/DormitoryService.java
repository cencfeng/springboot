package com.example.myspringboot.service;

import java.util.List;
import com.example.myspringboot.entity.Dormitory;
import com.example.myspringboot.entity.UserDetail;
import com.github.pagehelper.PageInfo;


public interface DormitoryService {

	List<Dormitory> getDormitory();
	List<Dormitory> getAllRoom(String strDormitory);
	List<Dormitory> getLeftRoom(String strDormitory);
	//List<UserDetail> getDormitoryliveinfo(String strDormitorynumber, String strRoomnumber);
	//分页
	PageInfo<UserDetail> getDormitoryliveinfo(String strDormitorynumber, String strRoomnumber, Integer currentPage, Integer pageSize);
	void applyDormitory(String username, String name, String dormitory, String roomNumber);

	List<UserDetail> getTest();
}
