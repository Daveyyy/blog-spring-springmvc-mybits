package com.mjl.model.PO;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Alvin on 15/10/4.
 */
public class Topic implements Serializable {
    /*
    帖子的属性
     */
    public static final int DIGEST_TOPIC = 1;
    public static final int NOT_DIGEST_TOPIC = 0;





    private int topciId;
    private int boardId;
    private String topicTitle;
    private int userId;
    private Timestamp createTime;
    private Timestamp lastPost;
    private int topicViews;
    private int topicReplies;
    private int digest = NOT_DIGEST_TOPIC;

    /*
    其中topic与user是多对一的关系,因为一个用户可以有多个话题
     */


    public int getTopciId() {
        return topciId;
    }

    public void setTopciId(int topciId) {
        this.topciId = topciId;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastPost() {
        return lastPost;
    }

    public void setLastPost(Timestamp lastPost) {
        this.lastPost = lastPost;
    }

    public int getTopicViews() {
        return topicViews;
    }

    public void setTopicViews(int topicViews) {
        this.topicViews = topicViews;
    }

    public int getTopicReplies() {
        return topicReplies;
    }

    public void setTopicReplies(int topicReplies) {
        this.topicReplies = topicReplies;
    }

    public int getDigest() {
        return digest;
    }

    public void setDigest(int digest) {
        this.digest = digest;
    }
}
