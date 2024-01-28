package com.add.courseManagement.repository;

import com.add.courseManagement.model.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultimediaRepository extends JpaRepository<Multimedia, String> {
}
