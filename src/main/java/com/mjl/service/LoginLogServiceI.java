package com.mjl.service;

import com.mjl.model.PO.User;
import com.mjl.model.PO.UserLoginLog;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Alvin on 15/10/11.
 */
public interface LoginLogServiceI {
    public void ListAllUserLoginLog();
    public void AddUserLoginLog(UserLoginLog userLoginLog);
}
