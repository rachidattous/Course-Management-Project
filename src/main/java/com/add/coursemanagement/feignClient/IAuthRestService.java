package com.add.coursemanagement.feignClient;

import com.add.coursemanagement.feignClient.config.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "auth", configuration = FeignClientConfig.class)
public interface IAuthRestService {

  @GetMapping(value = "/api/auth/users/active/id")
  List<String> getActiveUserIds();

}

