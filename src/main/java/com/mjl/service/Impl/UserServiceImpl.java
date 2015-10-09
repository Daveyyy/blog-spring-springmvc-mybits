package com.mjl.service.Impl;

import com.mjl.dao.UserDaoI;
import com.mjl.model.PO.User;
import com.mjl.service.UserSerivceI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Alvin on 15/10/7.
 */
@Service
public class UserServiceImpl implements UserSerivceI{
    //自动注入UserDaoI
    @Resource
    public UserDaoI userMapper;

    public void addUser(User user) {
        if(user != null) {
            userMapper.addUser(user);
        }
    }

    public void updateUserByUserName(User user) {
            if(user != null){
                userMapper.updateUserByUserName(user);
            }
    }

    public User getUserByUserName(String userName) {
        if(userName == null ){
           return null;
        }
        return userMapper.findUserByUserName(userName);

    }

    public void deleteUserByUserName(String userName) {

    }

    public void loginSuccess(User user) {

    }


}
