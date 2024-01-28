package com.add.courseManagement.services;

import com.add.courseManagement.dto.CourseDTO;
import com.add.courseManagement.dto.SearchCourseDTO;
import com.add.courseManagement.dto.UpdateCourseDTO;
import com.add.courseManagement.model.Course;
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
