package com.add.courseManagement.repository;

import com.add.courseManagement.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, String> {
}
