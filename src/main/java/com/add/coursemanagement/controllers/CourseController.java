package com.add.coursemanagement.controllers;

import com.add.coursemanagement.dto.CourseDTO;
import com.add.coursemanagement.dto.SearchCourseDTO;
import com.add.coursemanagement.dto.UpdateCourseDTO;
import com.add.coursemanagement.model.Course;
import com.add.coursemanagement.services.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/course")
public class CourseController {

    private final ICourseService iCourseService;

    @PutMapping(consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public Optional<Course> addCourse(@Valid @ModelAttribute CourseDTO courseDTO){
        return iCourseService.createCourse(courseDTO);
    }

    @PutMapping(value = "/{courseId}", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public Optional<Course> updateCourse(@PathVariable String courseId, @Valid @ModelAttribute UpdateCourseDTO updateCourseDTO){
        return iCourseService.updateCourse(courseId, updateCourseDTO);
    }

    @GetMapping(value = "/{userId}")
    public Page<Course> getCoursesByUserId(@PathVariable String userId, Pageable pageable){
        return iCourseService.getCoursesByUserId(userId, pageable);
    }

    @PostMapping("/search")
    public Page<Course> search(@RequestBody SearchCourseDTO searchCourseDTO, Pageable pageable){
        return iCourseService.searchCourses(searchCourseDTO, pageable);
    }

    @DeleteMapping(value = "/{userId}/{courseId}")
    public void deleteCourseById(@PathVariable String userId, @PathVariable String courseId){
        iCourseService.deleteCourse(userId, courseId);
    }

}
