package com.mjl.service.Impl;

import com.mjl.dao.ReplyDaoI;
import com.mjl.model.PO.Reply;
import com.mjl.service.ReplyServiceI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Alvin on 15/10/25.
 */
@Service
public class ReplyServiceImpl implements ReplyServiceI {

    @Resource
    ReplyDaoI replyDaoI;



    public void addReply(Reply reply) {
        Reply dbreply = reply;
        dbreply.setReplyCreateTime(new Timestamp(new Date().getTime()));
        replyDaoI.addReply(dbreply);
    }
}
