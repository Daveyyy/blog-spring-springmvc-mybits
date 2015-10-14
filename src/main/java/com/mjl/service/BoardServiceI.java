package com.mjl.service;

import com.mjl.model.PO.Board;

import java.util.List;

/**
 * Created by Alvin on 15/10/13.
 */
public interface BoardServiceI {
    public void addBoardByBoard(Board board);
    public void deleteBoadrByBoardName(String BoardName);
    public List<Board> listAllBoard();
    public Board IntoBoardByBoardId(int boardId);
    public Board IntoBoardByBoardName(String boardName);
}
