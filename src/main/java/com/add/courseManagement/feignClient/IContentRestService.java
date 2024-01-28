package com.add.courseManagement.feignClient;

import com.add.courseManagement.dto.ContentResponseDTO;
import com.add.courseManagement.dto.ImageDTO;
import com.add.courseManagement.feignClient.config.FeignClientConfig;
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

