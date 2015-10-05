package com.mjl.dao;

import com.mjl.model.PO.User;

/**
 * Created by Alvin on 15/10/5.
 */
public interface UserDaoI {
    public User selectUserByUserName(String username);
    public User selectUserByUserId(int id);
    public void addUser(User user);
}
