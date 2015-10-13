package com.mjl.controller;

import com.mjl.dao.UserLoginLogDaoI;
import com.mjl.model.PO.User;
import com.mjl.model.PO.UserLoginLog;
import com.mjl.service.Impl.UserServiceImpl;
import com.mjl.service.LoginLogServiceI;
import com.mjl.service.UserSerivceI;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    @Resource
    LoginLogServiceI loginLogServiceI;



    /*
    用户登录功能

     */
    @RequestMapping(value = "/userlogin", method = RequestMethod.POST)
    public String Userlogin(User user, HttpServletRequest request,RedirectAttributes redirectAttributes) {
        User dbuser = userSerivce.getUserByUserName(user.getUserName());
            if (dbuser != null && dbuser.getPassWord().equals(user.getPassWord())) {
                //保存入用户的信息
                dbuser.setLastIp(request.getRemoteAddr());
                Timestamp lastloginTime = new Timestamp(new Date().getTime());
                dbuser.setLastLoginTime(lastloginTime);
                dbuser.setCredit(5 + dbuser.getCredit());
                userSerivce.updateUserByUserName(dbuser);
                //保存入用户登录表的信息
                UserLoginLog userLoginLog = new UserLoginLog();
                userLoginLog.setUserName(dbuser.getUserName());
                userLoginLog.setLoginIp(request.getRemoteAddr());
                userLoginLog.setLoginDateTime(lastloginTime);
                loginLogServiceI.AddUserLoginLog(userLoginLog);

                request.getSession().setAttribute("username",dbuser.getUserName());
                return "main";
            }

        request.getSession().setAttribute("Msg", "登录失败,用户名或密码错误!");

        return "user/loginStatus";
    }

    /*

    注册用户功能
     */
    @RequestMapping(value = "/register" ,method = RequestMethod.POST)
    public String UserRegister(User user ,HttpServletRequest request){
        User tempuser =user;
        if(tempuser != null){
        try {
            tempuser.setLastIp(request.getRemoteAddr());
            Timestamp createloginTime = new Timestamp(new Date().getTime());
            tempuser.setCreateTime(createloginTime);
            tempuser.setLastLoginTime(createloginTime);

            System.out.println("!!!"+tempuser.toString());
            userSerivce.addUser(tempuser);

            //保存入用户登录表的信息
            UserLoginLog userLoginLog = new UserLoginLog();
            userLoginLog.setUserName(tempuser.getUserName());
            userLoginLog.setLoginIp(request.getRemoteAddr());
            userLoginLog.setLoginDateTime(createloginTime);
            loginLogServiceI.AddUserLoginLog(userLoginLog);

        }catch (Exception e){
            e.printStackTrace();
            request.getSession().setAttribute("Msg", "注册失败,用户名或密码错误!");
            return "user/loginStatus";
        }
        }
        request.getSession().setAttribute("username", tempuser.getUserName());
        return "main";
    }

    //显示个人信息功能
    @RequestMapping(value = "/listUserInfo")
    public String ListUserInfo(String username,HttpServletRequest request){
        User dbuser = userSerivce.getUserByUserName(username);
        request.setAttribute("user", dbuser);
        return "user/userInfo";
    }

     //修改个人信息页面
    @RequestMapping(value = "/userUpdateInfo",method = RequestMethod.GET)
    public String UserUpdateInfoPage(String username,HttpServletRequest request){
        User dbuser = userSerivce.getUserByUserName(username);
        request.setAttribute("user",dbuser);
        return "user/userUpdateInfo";
    }

    //提交修改后的用户信息
    @RequestMapping(value ="/updateUserInfo" ,method = RequestMethod.POST)
    public String UpdateUserInfo(User user,RedirectAttributes redirectAttributes){
        User tempuser = user;
        userSerivce.updateUserByUserName(tempuser);
        redirectAttributes.addAttribute("username", tempuser.getUserName());
        return "redirect:listUserInfo.do";
    }

    //用户注销功能
    @RequestMapping(value = "/loginout")
    public String LoginOut(HttpServletRequest request){
        request.getSession().removeAttribute("username");
        return "main";
    }
}

