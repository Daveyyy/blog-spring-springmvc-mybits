package com.mjl.dao;

import com.mjl.model.PO.UserLoginLog;

import java.util.List;

/**
 * Created by Alvin on 15/10/10.
 */
public interface UserLoginLogDaoI {
    public List<UserLoginLog> listAllUserLoginLog();
    public void addUserLoginLog(UserLoginLog userLoginLog);
}
