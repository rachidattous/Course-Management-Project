package com.add.coursemanagement.controllers;

import com.add.coursemanagement.repository.CourseRepository;
import com.add.coursemanagement.repository.WeekRepository;
import com.add.coursemanagement.services.impl.WeekService;
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
