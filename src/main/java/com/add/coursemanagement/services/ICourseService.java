package com.add.coursemanagement.services;

import com.add.coursemanagement.dto.CourseDTO;
import com.add.coursemanagement.dto.SearchCourseDTO;
import com.add.coursemanagement.dto.UpdateCourseDTO;
import com.add.coursemanagement.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICourseService {
    Optional<Course> createCourse(CourseDTO courseDTO);

    Page<Course> getCoursesByUserId(String userId, Pageable pageable);

    Page<Course> searchCourses(SearchCourseDTO searchCourseDTO, Pageable pageable);

    Optional<Course> updateCourse(String courseId, UpdateCourseDTO updateCourseDTO);

    void deleteCourse(String userId, String courseId);

}
