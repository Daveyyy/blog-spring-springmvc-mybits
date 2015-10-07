package com.mjl.service;

import com.mjl.model.PO.User;

/**
 * Created by Alvin on 15/10/7.
 */
public interface UserSerivceI {
    public void addUser(User user);
    public void updateUserByUser(User user);
    public User getUserByUserName(String userName);
    public void deleteUserByUserName(String userName);
}
