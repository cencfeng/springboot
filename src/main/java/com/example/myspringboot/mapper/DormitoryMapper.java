package com.example.myspringboot.mapper;

import java.util.List;
import com.example.myspringboot.entity.Dormitory;
import com.example.myspringboot.entity.UserDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DormitoryMapper {
	List<Dormitory> getDormitory();
	List<Dormitory> getAllRoom(String strDormitory);
	List<Dormitory> getLeftRoom(String strDormitory);
	List<UserDetail> getDormitoryliveinfo(@Param("strDormitorynumber") String strDormitorynumber, @Param("strRoomnumber") String strRoomnumber);
	void applyDormitory(@Param("username") String username, @Param("name") String name, @Param("dormitory") String dormitory, @Param("roomNumber") String roomNumber);
}
