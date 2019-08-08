package com.wl.controller;

import com.wl.entity.User;
import com.wl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;
        
        @RequestMapping(value = "/loginUser",method = RequestMethod.GET)
        @ResponseBody
        public User loginUser(String name, int pass, HttpServletResponse response, HttpServletRequest request){
            User user = userService.loginUser(name,pass);
            return user;
        }
        @RequestMapping(value ="/registerUser",method = RequestMethod.GET)
        @ResponseBody
        public String registerUser(User user,HttpServletResponse response, HttpServletRequest request){
            System.out.println("用户注册"+user.getUsername()+'\t'+user.getPassword());
            userService.registerUser(user);
            return "register success";
        }
}
