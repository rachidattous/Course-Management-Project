package com.add.courseManagement.repository;

import com.add.courseManagement.model.Question;
import com.add.courseManagement.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuizRepository extends JpaRepository<Quiz, String> {

    Optional<Quiz> findQuizByQuestions(Question question);
}
