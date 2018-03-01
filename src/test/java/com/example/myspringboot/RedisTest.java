package com.example.myspringboot;

import com.example.myspringboot.entity.Menu;
import com.example.myspringboot.mapper.MenuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest{
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private MenuMapper menuMapper;
    @Test
    public void getMenuRedisTest() throws Exception{
        List<Menu> list = menuMapper.getMenu();
        redisTemplate.opsForList().rightPush("menu",list);
        //list
        ListOperations<String,Menu> listOperations =  redisTemplate.opsForList();
        List<Menu> list2 = redisTemplate.opsForList().range("menu",0,-1);
        //List<Menu> list3 = listOperations.range("menu",0,-1).subList(0,1);
        for (Menu menu:(List<Menu>)list2.get(0)) {
            System.out.println(menu.getM_name());
        }
    }
}
