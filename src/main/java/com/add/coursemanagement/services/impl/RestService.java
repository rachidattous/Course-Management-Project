package com.add.coursemanagement.services.impl;

import com.add.coursemanagement.dto.ContentResponseDTO;
import com.add.coursemanagement.dto.ImageDTO;
import com.add.coursemanagement.exception.ApiException;
import com.add.coursemanagement.feignClient.IAuthRestService;
import com.add.coursemanagement.feignClient.IContentRestService;
import com.add.coursemanagement.services.IRestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestService implements IRestService {

    private final IAuthRestService iAuthRestService;

    private final IContentRestService iContentRestService;

    @Override
    public List<String> getActiveUserIds() {
        try {
            System.out.println(iAuthRestService.getActiveUserIds());
            return iAuthRestService.getActiveUserIds();
        } catch (Exception e) {
            return new ArrayList<>();
        }

//        return Arrays.asList("test1");
    }

    @Override
    public ContentResponseDTO saveCourseImage(ImageDTO imageDTO) {
        try {
            return iContentRestService.uploadContent(imageDTO);
        } catch (Exception e) {
            throw new ApiException("Failed Uploading Image");
        }
    }

    @Override
    public void deleteImage(String imageId) {
        try {
            iContentRestService.deleteFile(imageId);
        } catch (Exception e) {
            throw new ApiException("Failed Deleting Image with id: "+ imageId);
        }
    }


}