//package com.add.coursemanagement.model;
//
//import com.add.coursemanagement.constants.Category;
//import com.add.coursemanagement.constants.Language;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.GenericGenerator;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class CourseSetting {
//
//    @Id
//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name = "uuid2", strategy = "uuid2")
//    private String id;
//
//    @Builder.Default
//    private Category category = Category.A;
//
//    @Builder.Default
//    private Language language = Language.ENGLISH;
//
//    private String  title;
//
//    private String summary;
//
//    private String imageId;
//
//    private int requiredScore;
//
//    private int durationHour;
//
//    private int durationMinute;
//
//    private int bronzeMin;
//
//    private int bronzeMax;
//
//    private int silverMin;
//
//    private int silverMax;
//
//    private int goldMin;
//
//    private int goldMax;
//
//}
