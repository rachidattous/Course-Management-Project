package com.add.coursemanagement.repository;

import com.add.coursemanagement.model.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultimediaRepository extends JpaRepository<Multimedia, String> {
}
