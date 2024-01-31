package com.add.coursemanagement.repository;

import com.add.coursemanagement.model.Choice;
import com.add.coursemanagement.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, String> {

    Optional<Question> findQuestionByChoices(Choice choice);

}
