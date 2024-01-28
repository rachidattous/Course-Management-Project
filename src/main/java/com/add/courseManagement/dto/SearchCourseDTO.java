package com.add.courseManagement.dto;

import com.add.courseManagement.constants.Category;
import com.add.courseManagement.constants.Language;
import com.add.courseManagement.constants.State;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SearchCourseDTO {

    private String userId;

    private String title;

    private String summary;

    private LocalDate createdDate;

    private LocalTime createdTime;

    private LocalDate lastModifiedDate;

    private LocalTime lastModifiedTime;

    private State state;

    private Language language;

    private Category category;

}
