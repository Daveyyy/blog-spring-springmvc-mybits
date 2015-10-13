package com.mjl.controller;

import com.mjl.model.PO.Board;
import com.mjl.service.BoardServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * * Created by Alvin on 15/10/13.
 * */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Resource
    BoardServiceI boardServiceI;

    //进入论坛管理中心
     @RequestMapping(value = "/ManageCenter")
     public String ManageCenter(HttpServletRequest request){
         if(request.getSession().getAttribute("username").equals("admin")){
             return "admin/ManageCenter";
         }
         return "main";
     }

    //进入论坛版块管理中心
    @RequestMapping(value = "/ManageBoard")
    public String ManageBoard(HttpServletRequest request){
        if(request.getSession().getAttribute("username").equals("admin")){
            List<Board> boards = new ArrayList<Board>();
            boards = boardServiceI.listAllBoard();
            request.setAttribute("boards",boards);
            return "admin/ManageBoard";
        }
        return "main";
    }

    //添加论坛版块
    @RequestMapping(value = "/AddBoard", method = RequestMethod.POST)
    public String AddBoard(Board board,HttpServletRequest request){
        Board dbboard = board;
        if(dbboard != null){
            boardServiceI.addBoardByBoard(dbboard);
            return "admin/ManageBoard";
        }
        request.getSession().setAttribute("Msg", "添加版块出错!");
        return "amdin/error";
    }
}


