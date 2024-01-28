package com.add.courseManagement.repository;

import com.add.courseManagement.model.Activity;
import com.add.courseManagement.model.Week;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeekRepository extends JpaRepository<Week, String> {

    Optional<Week> findWeekByActivities(Activity activity);

}
