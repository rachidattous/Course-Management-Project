package com.add.courseManagement.repository;

import com.add.courseManagement.model.CourseSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSettingRepository extends JpaRepository<CourseSetting, String> {
}
