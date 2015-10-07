package com.mjl.dao;

import com.mjl.model.PO.User;

/**
 * Created by Alvin on 15/10/5.
 */
public interface UserDaoI {
    public User findUserByUserName(String username);
    public User findtUserByUserId(int id);
    public void addUser(User user);
    public void deleteUserByUserName(String username);
    public void updateUserByUserName(User user);
}
