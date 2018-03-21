package com.example.myspringboot.controller;
import com.example.myspringboot.entity.Dormitory;
import com.example.myspringboot.entity.UserDetail;
import com.example.myspringboot.service.DormitoryService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/dormitory")
public class DormitoryController {

	@Autowired
	private DormitoryService dormitoryService;
	@RequestMapping("/getdormitory")
	@ResponseBody
	public List<Dormitory> getDomitory(){
		List<Dormitory> list = dormitoryService.getDormitory();
		return list;
	}
	@RequestMapping("/getallroom")
	@ResponseBody
	public List<Dormitory> getAllRoom(String strDormitory){
		List<Dormitory> list = dormitoryService.getAllRoom(strDormitory);
		return list;
	}
	@RequestMapping("/getLeftRoom")
	@ResponseBody
	public List<Dormitory> getLeftRoom(String strDormitory){
		List<Dormitory> list = dormitoryService.getLeftRoom(strDormitory);
		return list;
	}
	@RequestMapping("/getDormitoryliveinfo")
	@ResponseBody
	public PageInfo<UserDetail> getDormitoryliveinfo(String strDormitorynumber,String strRoomnumber,Integer currentPage,Integer pageSize){
	    //List<UserDetail> list = dormitoryService.getDormitoryliveinfo(strDormitorynumber, strRoomnumber);
		System.out.println(currentPage);
		System.out.println(pageSize);
		PageInfo<UserDetail> pageInfo = dormitoryService.getDormitoryliveinfo(strDormitorynumber, strRoomnumber,currentPage,pageSize);
	    return pageInfo;
	}
	@RequestMapping("/applyDormitory")
	@ResponseBody
	public void applyDormitory(String username,String name,String dormitory,String roomNumber) {
		dormitoryService.applyDormitory(username,name,dormitory,roomNumber);
	}
	@RequestMapping("/gettest")
	@ResponseBody
	public List<UserDetail> getTest() {
		List<UserDetail> list = dormitoryService.getTest();
		return list;
	}
}
