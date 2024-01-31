package com.add.coursemanagement.repository;

import com.add.coursemanagement.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, String> {
}
