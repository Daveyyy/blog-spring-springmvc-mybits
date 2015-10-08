package com.mjl.test;

import com.mjl.dao.UserDaoI;
import com.mjl.model.PO.User;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Alvin on 15/10/5.
 */

public class MybatisTest {
    private static ApplicationContext ac;
    static{
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ac.getId());
        System.out.println(ac.getApplicationName());
    }

    public static void main(String[] args) {
        System.out.println("获取前");
        UserDaoI mapper = (UserDaoI)ac.getBean("UserDaoI");
        System.out.println("获取后");
//        User adduser1 =new User();
//        adduser1.setUserName("test5");
//        adduser1.setPassWord("1234");
//        adduser1.setUserEmail("aaa@fsd.com");
//        adduser1.setUserSex("男");
//        adduser1.setCreateTime(new Timestamp(new Date().getTime()));
//        mapper.updateUserByUserName(adduser1);
//        mapper.deleteUserByUserName("test3");
        User user = mapper.findUserByUserName("test2");
        if(user == null){
            System.out.println("error!!!");
        }
        System.out.println(user.toString());
    }
}
