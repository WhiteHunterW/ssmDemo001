package com.wl.service;

import com.wl.dao.UserDao;
import com.wl.entity.User;
import com.wl.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class ServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void register(){

        User user = new User();
        user.setPassword(456);
        user.setUsername("aaaaa");
        userService.registerUser(user);
        System.out.println("注册成功");
    }
    @Test
    public void login(){
        User user = userService.loginUser("kkkk",456);
        System.out.println(user);
    }
}
