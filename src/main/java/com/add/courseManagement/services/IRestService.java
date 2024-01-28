package com.add.courseManagement.services;

import com.add.courseManagement.dto.ContentResponseDTO;
import com.add.courseManagement.dto.ImageDTO;

import java.util.List;

public interface IRestService {

    List<String> getActiveUserIds();

    ContentResponseDTO saveCourseImage(ImageDTO imageDTO);

    void deleteImage(String imageId);
}