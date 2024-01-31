package com.add.coursemanagement.repository;

import com.add.coursemanagement.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, String> {
}
