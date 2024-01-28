package com.add.courseManagement.controllers;

import com.add.courseManagement.dto.SettingDTO;
import com.add.courseManagement.model.Course;
import com.add.courseManagement.services.ICourseSettingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/course/setting")
public class CourseSettingController {

    private final ICourseSettingService iCourseSettingService;

    @PutMapping(consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public Optional<Course> addSettings(@Valid @ModelAttribute SettingDTO settingDTO){
        return iCourseSettingService.addSettings(settingDTO);
    }
}
