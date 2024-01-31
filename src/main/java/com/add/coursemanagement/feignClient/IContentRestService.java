package com.add.coursemanagement.feignClient;

import com.add.coursemanagement.dto.ContentResponseDTO;
import com.add.coursemanagement.dto.ImageDTO;
import com.add.coursemanagement.feignClient.config.FeignClientConfig;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "file", configuration = FeignClientConfig.class)
public interface IContentRestService {

    @PutMapping(value = "/api/file/contents", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    ContentResponseDTO uploadContent(@Param() ImageDTO imageDTO);

    @DeleteMapping(value = "/api/file/{id}")
    void deleteFile(@PathVariable String id);


}

