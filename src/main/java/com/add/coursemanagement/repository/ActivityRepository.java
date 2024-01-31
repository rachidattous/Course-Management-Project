package com.add.coursemanagement.repository;

import com.add.coursemanagement.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, String> {
}
