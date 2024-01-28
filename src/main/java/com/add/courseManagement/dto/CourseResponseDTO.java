package com.add.courseManagement.dto;

import com.add.courseManagement.constants.Category;
import com.add.courseManagement.constants.Language;
import com.add.courseManagement.constants.State;
import com.add.courseManagement.model.Week;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponseDTO {

    private String id;

    private String title;

    private String summary;

    private LocalDate createdDate;

    private LocalTime createdTime;

    private LocalDate lastModifiedDate;

    private LocalTime lastModifiedTime;

    private State state;

    private Language language;

    private Category category;

    private String imageId;

    private List<Week> weeks;

}
