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

    public Board listAllPostsOfBoard(int boardId) {

        return  boardDaoI.listAllPostsOfBoard(boardId);
    }

    public Board IntoBoardByBoardId(int boardId) {

            return boardDaoI.findBoardByBoardId(boardId);

    }

    public Board IntoBoardByBoardName(String boardName) {

        return boardDaoI.findBoardByBoardName(boardName);
    }

    public void UpdatePostNum(int boardId) {
        System.out.println("+++++" + boardId);
        Board dbBoard = boardDaoI.findBoardByBoardId(boardId);

        System.out.println("!!+++baordid" + dbBoard.getBoardId());
        System.out.println("!!+++boardName" + dbBoard.getBoardName());
        System.out.println("!!+++boarddesc" + dbBoard.getBoardDesc());
        System.out.println("beford!!+++boardnum" + dbBoard.getBoardPostNum());
        dbBoard.setBoardPostNum(dbBoard.getBoardPostNum() + 1);
        boardDaoI.updateBoardByBoard(dbBoard);

    }
}
