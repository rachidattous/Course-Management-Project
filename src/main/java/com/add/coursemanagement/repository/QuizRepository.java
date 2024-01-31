package com.add.coursemanagement.repository;

import com.add.coursemanagement.model.Question;
import com.add.coursemanagement.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuizRepository extends JpaRepository<Quiz, String> {

    Optional<Quiz> findQuizByQuestions(Question question);
}
