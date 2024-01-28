package com.add.courseManagement.services;

import com.add.courseManagement.dto.*;
import com.add.courseManagement.model.Choice;
import com.add.courseManagement.model.Question;
import com.add.courseManagement.model.Quiz;
import com.add.courseManagement.model.Week;

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
