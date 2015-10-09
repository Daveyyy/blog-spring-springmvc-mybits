package com.mjl.controller;

import com.mjl.model.PO.User;
import com.mjl.service.UserSerivceI;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Alvin on 15/10/7.
 */
@Controller
@RequestMapping("/user")
@Scope("prototype")
public class UserController {

    @Resource
    UserSerivceI userSerivce;

//    @RequestMapping
//    public String register(User user,HttpServletRequest request){
//
//    }


    @RequestMapping(value = "/userlogin", method = RequestMethod.POST)
    public String Userlogin(User user, HttpServletRequest request) {
        User dbuser = userSerivce.getUserByUserName(user.getUserName());
            if (dbuser != null && dbuser.getPassWord().equals(user.getPassWord())) {
                dbuser.setLastIp(request.getRemoteAddr());
                Timestamp lastloginTime = new Timestamp(new Date().getTime());
                dbuser.setLastLoginTime(lastloginTime);
                dbuser.setCredit(5 + dbuser.getCredit());
//                System.out.println("username-->" + dbuser.getUserName());
//                System.out.println("ip--->"+dbuser.getLastIp());
                userSerivce.updateUserByUserName(dbuser);
                String username=dbuser.getUserName();
                request.getSession().setAttribute("username",dbuser.getUserName());
                return "main";
            }
        System.out.println("登录失败");
        request.getSession().setAttribute("Msg","登录失败!");
        return "user/loginStatus";
    }

    @RequestMapping(value = "/loginout")
    public String loginout(HttpServletRequest request){
        request.getSession().removeAttribute("username");
        return "main";
    }
}