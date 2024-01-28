package com.add.courseManagement.repository;

import com.add.courseManagement.model.Choice;
import com.add.courseManagement.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, String> {

    Optional<Question> findQuestionByChoices(Choice choice);

}
