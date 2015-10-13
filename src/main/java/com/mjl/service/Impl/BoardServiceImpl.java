package com.mjl.service.Impl;

import com.mjl.dao.BoardDaoI;
import com.mjl.model.PO.Board;
import com.mjl.service.BoardServiceI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Alvin on 15/10/13.
 */
@Service
public class BoardServiceImpl implements BoardServiceI{

    @Resource
    BoardDaoI boardDaoI;

    public void addBoardByBoard(Board board) {
        if(board != null ){
            boardDaoI.addBoard(board);
        }
    }

    public void deleteBoadrByBoardName(String BoardName) {

    }

    public List<Board> listAllBoard() {
        return boardDaoI.listAllBoard();
    }
}
