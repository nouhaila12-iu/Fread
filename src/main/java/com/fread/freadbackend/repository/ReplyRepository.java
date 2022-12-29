package com.fread.freadbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fread.freadbackend.model.Reply;

public interface ReplyRepository  extends JpaRepository<Reply,Integer> {

    Reply findReplyByRepliedbyAndQidAndTimestamp(String user, Integer qid, String timestamp);
}