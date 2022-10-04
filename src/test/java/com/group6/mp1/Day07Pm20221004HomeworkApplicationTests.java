package com.group6.mp1;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.group6.mp1.entity.User;
import com.group6.mp1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Day07Pm20221004HomeworkApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
    }

    @Test
    public void testAdd(){
        User user = new User();
        user.setId(11);
        user.setName("11name");
        user.setAge(11);
        user.setEmail("11@qq.com");
        user.setAddress("11Japan");
        int insert = userMapper.insert(user);
        System.out.println(insert);

    }


    @Test
    public void test01(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","hua");
        queryWrapper.lt("age", 30);
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }
}
