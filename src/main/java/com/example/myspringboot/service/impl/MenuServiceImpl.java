package com.example.myspringboot.service.impl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import com.example.myspringboot.entity.Menu;
import com.example.myspringboot.mapper.MenuMapper;
import com.example.myspringboot.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	MenuMapper menuMapper;
	@Autowired
	private RedisTemplate redisTemplate;
	@Override
	public List<Menu> getMenu2() {
	    ListOperations<String,Menu> listOperations =  redisTemplate.opsForList();
	    return listOperations.range("menu",0,-1);
	}
	@Override
	public List<Menu> getMenu() {
		// TODO Auto-generated method stub
		boolean hasMenu = redisTemplate.hasKey("menu");
		List<Menu> list = new ArrayList<Menu>();
		if(hasMenu){
			list = (List<Menu>)redisTemplate.opsForList().range("menu",0,-1).get(0);
		}else {
		    list = menuMapper.getMenu();
		    if(!list.isEmpty()) {
				redisTemplate.opsForList().rightPush("menu", list);
			}
		}
		return list;
	}
	@Override
	public List<Menu> getSubMenu(int mid) {
		// TODO Auto-generated method stub
		boolean hassubMenu =redisTemplate.hasKey("submenu"+mid);
		List<Menu> list = new ArrayList<Menu>();
		if(hassubMenu){
            list = (List<Menu>)redisTemplate.opsForList().range("submenu"+mid,0,-1).get(0);
		}else {
			list = menuMapper.getSubMenu(mid);
			redisTemplate.opsForList().rightPush("submenu"+mid,list);
		}
		return list;
	}
	@Override
	public void insertMenu(String m_name, String m_url, String m_order,String parentid,String m_level) {
		// TODO Auto-generated method stub
		menuMapper.insertMenu(m_name,m_url,m_order,parentid,m_level);
	}
	@Override
	public void delMenu(int mid) {
		// TODO Auto-generated method stub
		menuMapper.delMenu(mid);
	}

}
