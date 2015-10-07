package com.mjl.controller;

import com.mjl.model.PO.User;
import com.mjl.service.UserSerivceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Alvin on 15/10/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserSerivceI userSerivce;

    @RequestMapping("/userlogin")
    public String Userlogin(User user,HttpServletRequest request){
        if(user != null && user.getUserName()!= ""){
           User usertemp = userSerivce.getUserByUserName(user.getUserName());
           if(usertemp != null && usertemp.getPassWord().equals(user.getPassWord())){
                return "loginSuccess";
           }
        }

        return "error";


    }
}
