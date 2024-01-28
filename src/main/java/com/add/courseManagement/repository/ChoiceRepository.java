package com.add.courseManagement.repository;

import com.add.courseManagement.model.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChoiceRepository extends JpaRepository<Choice, String> {
}
