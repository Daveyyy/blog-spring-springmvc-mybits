package com.mjl.controller;

import com.mjl.model.PO.Post;
import com.mjl.service.PostServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Alvin on 15/10/14.
 */
@Controller
@RequestMapping(value ="/post")
public class postController {

    @Resource
    PostServiceI postServiceI;

    @RequestMapping(value ="/addPost")
    public String addPost(Post post,HttpServletRequest request){
        Post dbpost = post;

        Timestamp createloginTime = new Timestamp(new Date().getTime());
        dbpost.setPostCreateTime(createloginTime);
        dbpost.setPostUpdateTime(createloginTime);

        postServiceI.addPostByPost(post);

        return "postMain";
    }
}
