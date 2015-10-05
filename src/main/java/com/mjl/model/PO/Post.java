package com.mjl.model.PO;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Alvin on 15/10/4.
 * 帖子类
 */
public class Post implements Serializable{


    private int postId;
    private int boardId;
    private int topicId;
    private int userId;
    private int postType;
    private String postTitle;
    private String postText;
    private Timestamp dateTime;

    /*
    帖子类与用户类形成多对一关系,一个用户可以发多个帖子
     */

    /*
    帖子类与话题类形成多对一的关系,多个帖子可以属于同一个话题
     */


    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostType() {
        return postType;
    }

    public void setPostType(int postType) {
        this.postType = postType;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }
}
