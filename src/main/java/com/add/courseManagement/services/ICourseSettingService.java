package com.add.courseManagement.services;

import com.add.courseManagement.dto.SettingDTO;
import com.add.courseManagement.model.Course;

import java.util.Optional;

public interface ICourseSettingService {

    Optional<Course> addSettings(SettingDTO settingDTO);

    Optional<Course>  updateSettings(SettingDTO settingDTO);
}
