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
    private int topicNum;

    /*
    由于board与user是多对多对应关系
     */
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

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
