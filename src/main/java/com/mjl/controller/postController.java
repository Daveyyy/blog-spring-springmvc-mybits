package com.mjl.controller;

import com.mjl.model.PO.Post;
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

    @RequestMapping(value ="/addPost")
    public String addPost(Post post,HttpServletRequest request){
        Object board = request.getSession().getAttribute("boardId");
        Post dbpost = post;
        dbpost.setPostBoardID((Integer) board);
        System.out.println("boardid_---->" +board);
        Timestamp createloginTime = new Timestamp(new Date().getTime());
        dbpost.setPostCreateTime(createloginTime);
        dbpost.setPostUpdateTime(createloginTime);
        postServiceI.addPostByPost(post);
        return "postMain";
    }

    @RequestMapping(value = "/editorPost")
    public String editorPost(HttpServletRequest request,RedirectAttributes redirectAttributes){
        Object boardIdTemp = request.getAttribute("boardId");
        System.out.println("!!!!"+boardIdTemp);
        redirectAttributes.addFlashAttribute("boardId",boardIdTemp);
        return "forward:/view/post/addPost.jsp";
    }

}
