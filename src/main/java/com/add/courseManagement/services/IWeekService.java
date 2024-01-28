package com.add.courseManagement.services;

import com.add.courseManagement.dto.WeekDTO;
import com.add.courseManagement.model.Course;
import com.add.courseManagement.model.Week;

import java.util.List;
import java.util.Optional;

public interface IWeekService {

    Optional<Course> createWeek(String courseId, List<WeekDTO> weekDTOList);

    Optional<Week> getWeekById(String weekId);

    List<Week> getAll(String courseId);

    Optional<Week> updateWeek(String weekId, WeekDTO weekDTO);

    void deleteWeek(String weekId);
}
