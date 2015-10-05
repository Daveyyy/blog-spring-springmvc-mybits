package com.mjl.model.PO;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Alvin on 15/10/4.
 */
public class User implements Serializable {
    /*
    分别表示用户的对应状态 1表示锁定 0表示解锁
     */
    private static final int USER_LOCK = 1;
    private static final int USER_UNLOCK = 0;
    /*
    表示用户类型 1为普通用户 2为管理员
     */
    private static final int USER_ADMIN = 2;
    private static final int USER_NORMAL = 1;


    private int userId;
    private String userName;
    private String passWord;
    private String userEmail;
    private String userSex;
    private Timestamp createTime;
    private int userType;
    private int userState;
    private int credit;
    private Timestamp lastLoginTime;
    private String lastIp;

    /*
    用户表与论坛板块表相联,并且是多对多
     */
    private List<Board> boards;

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userSex='" + userSex + '\'' +
                ", createTime=" + createTime +
                ", userType=" + userType +
                ", userState=" + userState +
                ", credit=" + credit +
                ", lastLoginTime=" + lastLoginTime +
                ", lastIp='" + lastIp + '\'' +
                ", boards=" + boards +
                '}';
    }
}
