package com.mjl.controller;

import com.mjl.model.PO.Board;
import com.mjl.service.BoardServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Alvin on 15/10/14.
 */

@Controller
@RequestMapping(value = "/board")
public class BoardController {

    @Resource
    BoardServiceI boardServiceI;

    @RequestMapping(value = "/listPosts-{boardId}")
    public String IntoBoard(@PathVariable int boardId,HttpServletRequest request){
        System.out.println("!!!!!"+boardId);
        Board board = boardServiceI.IntoBoardByBoardId(boardId);
        request.setAttribute("board",board);
        return "post/postMain";
    }
}
