package com.mjl.service;

import com.mjl.model.PO.Post;

/**
 * Created by Alvin on 15/10/13.
 */
public interface PostServiceI {
    public void addPostByPost(Post post);
    public Post ListPostContent(int postId);
}
