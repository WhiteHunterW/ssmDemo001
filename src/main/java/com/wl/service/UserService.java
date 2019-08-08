package com.wl.service;

import com.wl.entity.User;

/**
 * 业务逻辑层
 */
public interface UserService {

    /**
     * 用户登录
     * @param name
     * @return
     */
    public User loginUser(String name,int password);

    /**
     * 用户注册
     * @param user
     */
    public void registerUser(User user);
    
}
