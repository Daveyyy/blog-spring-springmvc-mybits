package com.mjl.controller;

import com.mjl.model.PO.Board;
import com.mjl.model.PO.Post;
import com.mjl.service.BoardServiceI;
import com.mjl.service.PostServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @Resource
    BoardServiceI boardServiceI;

    @RequestMapping(value ="/addPost")
    public String addPost(Post post){
        Post dbpost = post;
        Timestamp createloginTime = new Timestamp(new Date().getTime());
        dbpost.setPostCreateTime(createloginTime);
        dbpost.setPostUpdateTime(createloginTime);

        postServiceI.addPostByPost(post);
        boardServiceI.UpdatePostNum(post.getPostBoardId());
        return "post/postMain";
    }




}
