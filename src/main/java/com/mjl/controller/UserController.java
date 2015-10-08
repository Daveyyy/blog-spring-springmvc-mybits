package com.mjl.controller;

import com.mjl.model.PO.User;
import com.mjl.service.UserSerivceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

//    @RequestMapping
//    public String register(User user,HttpServletRequest request){
//
//    }


    @RequestMapping(value = "/userlogin", method = RequestMethod.POST)
    public String Userlogin(User user, HttpServletRequest request) {
        if (user != null && user.getUserName() != "") {
            System.out.println("ip--->"+request.getRemoteAddr());
            User dbuser = userSerivce.getUserByUserName(user.getUserName());
            if (dbuser != null && dbuser.getPassWord().equals(user.getPassWord())) {
                request.getSession().setAttribute("userLoginMsg","用户登录成功!");
                return "user/loginStatus";
            }
        }
        request.getSession().setAttribute("userLoginMsg","登录失败!用户名或密码错误!");
        return "user/loginStatus";
    }


}