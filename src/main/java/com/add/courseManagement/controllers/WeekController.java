package com.add.courseManagement.controllers;

import com.add.courseManagement.dto.WeekDTO;
import com.add.courseManagement.model.Course;
import com.add.courseManagement.model.Week;
import com.add.courseManagement.services.IWeekService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/course/week")
public class WeekController {

    private final IWeekService iWeekService;

    @PostMapping(value = "/{courseId}")
    public Optional<Course> createWeek(@PathVariable String courseId, @RequestBody List<WeekDTO> weekDTOList){
        return iWeekService.createWeek(courseId, weekDTOList);
    }

    @GetMapping(value = "/{weekId}")
    public Optional<Week> getWeekById(@PathVariable String weekId){
        return iWeekService.getWeekById(weekId);
    }

    @GetMapping(value = "/all/{courseId}")
    public List<Week> getAllWeeks(@PathVariable String courseId){
        return iWeekService.getAll(courseId);
    }

    @PutMapping(value = "/{weekId}")
    public Optional<Week> updateWeek(@PathVariable String weekId, @RequestBody WeekDTO weekDTO){
        return iWeekService.updateWeek(weekId, weekDTO);
    }


    @DeleteMapping(value = "/{weekId}")
    public void updateWeekTitle(@PathVariable String weekId){
        iWeekService.deleteWeek(weekId);
    }
}
