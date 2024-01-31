package com.add.coursemanagement.dto;

import com.add.coursemanagement.constants.Category;
import com.add.coursemanagement.constants.Language;
import com.add.coursemanagement.constants.State;
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
