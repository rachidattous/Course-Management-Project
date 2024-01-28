package com.add.courseManagement.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SettingDTO {

    @NotNull
    @NotBlank
    private String courseId;

    private String category;

    private String language;

    @NotNull
    @NotBlank
    private String title;

    @NotNull
    @NotBlank
    private String summary;

    private MultipartFile image;

    private int requiredScore;

    private int durationHour;

    private int durationMinute;

    private int bronzeMin;

    private int bronzeMax;

    private int silverMin;

    private int silverMax;

    private int goldMin;

    private int goldMax;

}
