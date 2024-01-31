package com.add.coursemanagement.repository;


import com.add.coursemanagement.model.Course;
import com.add.coursemanagement.model.Week;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, String>, JpaSpecificationExecutor<Course> {

    Optional<Course> findByIdOrTitleAndUserId(String id, String title, String userId);

    Optional<Course> findCourseByWeeks(Week week);

    Page<Course> getAllByUserId(String userId, Pageable pageable);
}
