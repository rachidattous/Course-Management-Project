package com.add.coursemanagement.repository;

import com.add.coursemanagement.model.Activity;
import com.add.coursemanagement.model.Week;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeekRepository extends JpaRepository<Week, String> {

    Optional<Week> findWeekByActivities(Activity activity);

}
