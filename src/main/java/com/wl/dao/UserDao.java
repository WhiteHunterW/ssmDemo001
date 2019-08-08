package com.wl.dao;

import com.wl.entity.User;
import org.omg.CORBA.PUBLIC_MEMBER;

public interface UserDao {

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     * @throws Exception
     */
    public User findByUsername(String username) throws Exception;

    /**
     * 插入用户
     * @param user
     * @throws Exception
     */
    public void insertUser(User user) throws Exception;
}
