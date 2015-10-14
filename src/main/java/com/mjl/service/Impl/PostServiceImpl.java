package com.mjl.service.Impl;

import com.mjl.dao.PostDaoI;
import com.mjl.model.PO.Post;
import com.mjl.service.PostServiceI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Alvin on 15/10/14.
 */
@Service
public class PostServiceImpl  implements PostServiceI{

    @Resource
    PostDaoI postDaoI;

    public void addPostByPost(Post post) {
        postDaoI.addPost(post);
    }
}
