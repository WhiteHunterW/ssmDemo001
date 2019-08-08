package com.wl.dao;

import com.wl.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {
    
    @Autowired 
    UserDao userDao;
    
    @Test
    public void findByUsername() throws Exception{
        User user = userDao.findByUsername("kkkk");
        System.out.println(user);
    }
    @Test
    public void insertUser() throws Exception{
        User user = new User();
        user.setUsername("fffff");
       user.setPassword(123);
        userDao.insertUser(user);
    }
}
