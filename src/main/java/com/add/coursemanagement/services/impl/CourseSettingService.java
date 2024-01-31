//package com.add.coursemanagement.services.impl;
//
//import com.add.coursemanagement.constants.Category;
//import com.add.coursemanagement.constants.Language;
//import com.add.coursemanagement.dto.ImageDTO;
//import com.add.coursemanagement.dto.SettingDTO;
//import com.add.coursemanagement.exception.ApiException;
//import com.add.coursemanagement.model.Course;
//import com.add.coursemanagement.model.CourseSetting;
//import com.add.coursemanagement.repository.CourseRepository;
//import com.add.coursemanagement.repository.CourseSettingRepository;
//import com.add.coursemanagement.services.ICourseSettingService;
//import com.add.coursemanagement.services.IRestService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//
//@Slf4j
//@Service
//@Transactional
//@RequiredArgsConstructor
//public class CourseSettingService implements ICourseSettingService {
//
//    private final CourseRepository courseRepository;
//
//    private final CourseSettingRepository courseSettingRepository;
//
//    private final IRestService iRestService;
//
//
//
//    @Override
//    public Optional<Course> addSettings(SettingDTO settingDTO) {
//        return Optional.of(settingDTO.getCourseId())
//                .map(c -> courseRepository.findById(c))
//                .filter(c -> c.isPresent())
//                .map(c -> c.get())
//                .map(c -> {
//
//                    CourseSetting courseSetting = buildSettings(settingDTO);
//
//                    c.setTitle(settingDTO.getTitle());
//
//                    c.setSummary(settingDTO.getSummary());
//
//                    if(settingDTO.getImage() != null){
//                        if(c.getImageId() != null)
//                            iRestService.deleteImage(c.getImageId());
//
//                        String imageId = iRestService.saveCourseImage(buildImageDTO(c.getUserId(), settingDTO)).getId();
//
//                        c.setImageId(imageId);
//
//                        courseSetting.setImageId(imageId);
//                    }
//
//                    courseSettingRepository.save(courseSetting);
//
//                    c.setCourseSetting(courseSetting);
//
//                    return Optional.of(courseRepository.save(c));
//                })
//                .orElseThrow(() -> new ApiException("Course with id : "+ settingDTO.getCourseId() +" not found"));
//    }
//
//    @Override
//    public Optional<Course> updateSettings(SettingDTO settingDTO){
//        return  Optional.of(settingDTO.getCourseId())
//                .map(c -> courseRepository.findById(c))
//                .filter(c -> c.isPresent())
//                .map(c -> c.get())
//                .map(c -> {
//
//                    if(!settingDTO.getCategory().equals(null))
//                        c.getCourseSetting().setCategory(Category.getByValue(settingDTO.getCategory()));
//
//                    if(!settingDTO.getLanguage().equals(null))
//                        c.getCourseSetting().setLanguage(Language.getByValue(settingDTO.getLanguage()));
//
//                    if(settingDTO.getDurationHour() != 0)
//                        c.getCourseSetting().setDurationHour(settingDTO.getDurationHour());
//
//                    if(settingDTO.getBronzeMin() != 0)
//                        c.getCourseSetting().setBronzeMin(settingDTO.getBronzeMin());
//
//                    if(settingDTO.getRequiredScore() != 0)
//                        c.getCourseSetting().setRequiredScore(settingDTO.getRequiredScore());
//
//                    if(settingDTO.getBronzeMax() != 0)
//                        c.getCourseSetting().setBronzeMax(settingDTO.getBronzeMax());
//
//                    if(settingDTO.getSilverMin() != 0)
//                        c.getCourseSetting().setSilverMin(settingDTO.getSilverMin());
//
//                    if(settingDTO.getSilverMax() != 0)
//                        c.getCourseSetting().setSilverMax(settingDTO.getSilverMax());
//
//                    if(settingDTO.getGoldMin() != 0)
//                        c.getCourseSetting().setGoldMin(settingDTO.getGoldMin());
//
//                    if(settingDTO.getGoldMax() != 0)
//                        c.getCourseSetting().setGoldMax(settingDTO.getGoldMax());
//
//
//                    return Optional.of(courseRepository.save(c));
//                })
//                .orElseThrow(() -> new ApiException("Course with id : "+ settingDTO.getCourseId() +" not found"));
//    }
//
//    public ImageDTO buildImageDTO(String userId, SettingDTO settingDTO) {
//        return ImageDTO.builder()
//                .userId(userId)
//                .title(settingDTO.getTitle())
//                .description(settingDTO.getSummary())
//                .file(settingDTO.getImage())
//                .build();
//    }
//
//    public CourseSetting buildSettings(SettingDTO settingDTO){
//        return CourseSetting.builder()
//                .category(Category.getByValue(settingDTO.getCategory()))
//                .language(Language.getByValue(settingDTO.getLanguage()))
//                .title(settingDTO.getTitle())
//                .summary(settingDTO.getSummary())
//                .requiredScore(settingDTO.getRequiredScore())
//                .durationHour(settingDTO.getDurationHour())
//                .durationMinute(settingDTO.getDurationMinute())
//                .bronzeMin(settingDTO.getBronzeMin())
//                .bronzeMax(settingDTO.getBronzeMax())
//                .silverMin(settingDTO.getSilverMin())
//                .silverMax(settingDTO.getSilverMax())
//                .goldMin(settingDTO.getGoldMin())
//                .goldMax(settingDTO.getGoldMax())
//                .build();
//    }
//}
