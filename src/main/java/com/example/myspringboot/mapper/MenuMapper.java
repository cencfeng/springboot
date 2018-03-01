package com.example.myspringboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.myspringboot.entity.Menu;
@Mapper
public interface MenuMapper {

	List<Menu> getMenu();

	List<Menu> getSubMenu(int mid);

	void insertMenu(@Param("m_name") String m_name, @Param("m_url") String m_url, @Param("m_order") String m_order,
                    @Param("parentid") String parentid, @Param("m_level") String m_level);
	void delMenu(int mid);
}
