package com.mjl.controller;

import com.mjl.model.PO.Board;
import com.mjl.service.BoardServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Alvin on 15/10/13.
 */
@Controller
public class BaseController {
    @Resource
    BoardServiceI boardServiceI;

    @RequestMapping(value = "/mainPage")
    public String mainPage(HttpServletRequest request){
        List<Board> boards=boardServiceI.listAllBoard();
        request.setAttribute("boards",boards);
        return  "main";
    }
}
