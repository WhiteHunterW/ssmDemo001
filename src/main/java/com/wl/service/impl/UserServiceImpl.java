package com.wl.service.impl;

import com.wl.dao.UserDao;
import com.wl.entity.User;
import com.wl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User loginUser(String name,int password) {
       try {
           User user = userDao.findByUsername(name);
           if(user!=null && user.getPassword()==password){
               return user;
           }
       }
       catch (Exception e){
           throw new RuntimeException(e);
       }
        return null;
    }

    @Override
    public void registerUser(User user) {
        try {
            userDao.insertUser(user);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
