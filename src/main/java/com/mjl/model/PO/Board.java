package com.mjl.model.PO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Alvin on 15/10/4.
 */
public class Board implements Serializable {
    private int boardId;
    private String boardName;
    private String boadrDesc;
    private int boardPostNum;



    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getBoadrDesc() {
        return boadrDesc;
    }

    public void setBoadrDesc(String boadrDesc) {
        this.boadrDesc = boadrDesc;
    }

    public int getBoardPostNum() {
        return boardPostNum;
    }

    public void setBoardPostNum(int boardPostNum) {
        this.boardPostNum = boardPostNum;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardId=" + boardId +
                ", boardName='" + boardName + '\'' +
                ", boadrDesc='" + boadrDesc + '\'' +
                ", boardPostNum=" + boardPostNum +
                '}';
    }
}
