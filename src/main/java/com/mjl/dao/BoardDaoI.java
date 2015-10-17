package com.mjl.dao;

import com.mjl.model.PO.Board;

import java.util.List;

/**
 * Created by Alvin on 15/10/12.
 */
public interface BoardDaoI {
    public void addBoard(Board board);
    public List<Board> listAllBoard();
    public Board listAllPostsOfBoard(int boardId);
    public Board findBoardByBoardId(int boardId);
    public Board findBoardByBoardName(String boardName);

    public void updateBoardByBoard(Board board);
}
