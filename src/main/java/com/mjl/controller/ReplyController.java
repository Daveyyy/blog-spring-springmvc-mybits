package com.mjl.controller;

import com.mjl.model.PO.Reply;
import com.mjl.model.PO.User;
import com.mjl.service.ReplyServiceI;
import com.mjl.service.UserSerivceI;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Alvin on 15/10/25.
 */
@Controller
@RequestMapping(value = "/reply")
public class ReplyController {

    @Resource
    ReplyServiceI replyServiceI;

    @Resource
    UserSerivceI userSerivceI;

    @RequestMapping(value = "addreply" ,method = RequestMethod.POST)
    public String addReply(Reply reply,HttpServletRequest request){
        System.out.println("replyname--->"+reply.getReplyUserName());
        System.out.println("replycontent--->"+reply.getReplyContent());

        replyServiceI.addReply(reply);
        return "r";
    }

}
