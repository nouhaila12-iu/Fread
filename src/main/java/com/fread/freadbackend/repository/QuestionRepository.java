package com.fread.freadbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fread.freadbackend.model.Question;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

    Question findQuestionByPostedbyAndTimestampAndTopic(String user,String timestamp, String topic);
}
