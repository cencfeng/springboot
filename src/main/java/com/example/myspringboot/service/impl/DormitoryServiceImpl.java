package com.example.myspringboot.service.impl;
import java.util.List;

import com.example.myspringboot.entity.Dormitory;
import com.example.myspringboot.entity.UserDetail;
import com.example.myspringboot.mapper.DormitoryMapper;
import com.example.myspringboot.service.DormitoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DormitoryServiceImpl implements DormitoryService {

	@Autowired
	private DormitoryMapper dormitoryMapper;

	@Override
	public List<Dormitory> getDormitory() {
		// TODO Auto-generated method stub
		return dormitoryMapper.getDormitory();
	}

	@Override
	public List<Dormitory> getAllRoom(String strDormitory) {
		// TODO Auto-generated method stub
		return dormitoryMapper.getAllRoom(strDormitory);
	}

	@Override
	public PageInfo<UserDetail> getDormitoryliveinfo(String strDormitorynumber, String strRoomnumber,Integer currentPage,Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(currentPage,pageSize);
		List<UserDetail> list =  dormitoryMapper.getDormitoryliveinfo(strDormitorynumber, strRoomnumber);
		PageInfo<UserDetail> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public List<Dormitory> getLeftRoom(String strDormitory) {
		// TODO Auto-generated method stub
		return dormitoryMapper.getLeftRoom(strDormitory);
	}

	@Override
	@Transactional
	public void applyDormitory(String username, String name, String dormitory, String roomNumber) {
		// TODO Auto-generated method stub
		dormitoryMapper.applyDormitory(username, name, dormitory, roomNumber);
	}

	@Override
	public List<UserDetail> getTest() {
		return dormitoryMapper.getTest();
	}
}
