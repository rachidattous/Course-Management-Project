package com.add.coursemanagement.services;

import com.add.coursemanagement.dto.*;
import com.add.coursemanagement.model.Choice;
import com.add.coursemanagement.model.Question;
import com.add.coursemanagement.model.Quiz;
import com.add.coursemanagement.model.Week;

import java.util.List;
import java.util.Optional;

public interface IQuizService {

    Optional<Week> createQuiz(String weekId, QuizDTO quizDTO);

    Optional<Quiz> addQuestions(String quizId, List<QuestionDTO> questionDTOList);

    Optional<Question> addChoices(String questionId, List<ChoiceDTO> choiceDTOList);


    Optional<Quiz> updateQuiz(String activityId, UpdateQuizDTO updateQuizDTO);

    Optional<Question> updateQuestion(String questionId, UpdateQuestionDTO updateQuestionDTO);

    Optional<Choice> updateChoice(String choiceId, ChoiceDTO choiceDTO);

    void deleteQuiz(String quizId);

    void deleteQuestion(String questionId);

    void deleteChoice(String choiceId);
}
