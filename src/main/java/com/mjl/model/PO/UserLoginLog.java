package com.mjl.model.PO;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Alvin on 15/10/10.
 */
public class UserLoginLog implements Serializable{
    private int loginLogId;
    private String userName;
    private String loginIp;
    private Timestamp loginDateTime;

    private User user;

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getLoginDateTime() {
        return loginDateTime;
    }

    public void setLoginDateTime(Timestamp loginDateTime) {
        this.loginDateTime = loginDateTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
