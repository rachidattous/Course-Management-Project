package com.add.courseManagement.controllers;

import com.add.courseManagement.repository.CourseRepository;
import com.add.courseManagement.repository.WeekRepository;
import com.add.courseManagement.services.impl.WeekService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {

  private final CourseRepository courseRepository;
  private final WeekRepository weekRepository;

  private final WeekService weekService;

  @GetMapping("/hi")
  // @SecurityRequirement(name = "Bearer Authentication")
  public String getHi() {
    return "Hi";
  }


}
