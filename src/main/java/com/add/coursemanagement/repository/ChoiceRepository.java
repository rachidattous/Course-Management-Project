package com.add.coursemanagement.repository;

import com.add.coursemanagement.model.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChoiceRepository extends JpaRepository<Choice, String> {
}
