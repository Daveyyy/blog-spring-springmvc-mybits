package com.mjl.model;

import java.io.Serializable;

/**
 * Created by Alvin on 15/10/4.
 */
public class Board implements Serializable {
    private int boardId;
    private String boardName;
    private String boadrDesc;
    private int topicNum;

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

    public int getTopicNum() {
        return topicNum;
    }

    public void setTopicNum(int topicNum) {
        this.topicNum = topicNum;
    }
}
