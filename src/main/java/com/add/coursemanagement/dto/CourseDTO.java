package com.add.coursemanagement.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    @NotNull
    @NotBlank
    private String userId;

    @NotNull
    @NotBlank
    private String title;

    @NotNull
    @NotBlank
    private String summary;

//    private String state;

    private MultipartFile image;

}
