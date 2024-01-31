package com.add.coursemanagement.services;

import com.add.coursemanagement.dto.WeekDTO;
import com.add.coursemanagement.model.Course;
import com.add.coursemanagement.model.Week;

import java.util.List;
import java.util.Optional;

public interface IWeekService {

    Optional<Course> createWeek(String courseId, List<WeekDTO> weekDTOList);

    Optional<Week> getWeekById(String weekId);

    List<Week> getAll(String courseId);

    Optional<Week> updateWeek(String weekId, WeekDTO weekDTO);

    void deleteWeek(String weekId);
}
