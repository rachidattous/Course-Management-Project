package com.add.courseManagement.repository;

import com.add.courseManagement.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, String> {
}
