package com.add.coursemanagement.services;

import com.add.coursemanagement.dto.ContentResponseDTO;
import com.add.coursemanagement.dto.ImageDTO;

import java.util.List;

public interface IRestService {

    List<String> getActiveUserIds();

    ContentResponseDTO saveCourseImage(ImageDTO imageDTO);

    void deleteImage(String imageId);
}