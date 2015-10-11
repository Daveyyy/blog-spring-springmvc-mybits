package com.mjl.service.Impl;

import com.mjl.dao.UserLoginLogDaoI;
import com.mjl.model.PO.UserLoginLog;
import com.mjl.service.LoginLogServiceI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Alvin on 15/10/11.
 */
@Service
public class LoginLogServiceImpl implements LoginLogServiceI{

    @Resource
    UserLoginLogDaoI userLoginLogDaoI;

    public void ListAllUserLoginLog() {

    }

    public void AddUserLoginLog(UserLoginLog userLoginLog) {
        userLoginLogDaoI.addUserLoginLog(userLoginLog);
    }


}
