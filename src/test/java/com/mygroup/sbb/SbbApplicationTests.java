package com.mygroup.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mygroup.sbb.answer.Answer;
import com.mygroup.sbb.answer.AnswerRepository;
import com.mygroup.sbb.question.QuestionRepository;

@SpringBootTest
class SbbApplicationTests {

@Autowired
private QuestionRepository questionRepository;

@Autowired
private AnswerRepository answerRepository;

@Test
void testJpa() {

}
}
