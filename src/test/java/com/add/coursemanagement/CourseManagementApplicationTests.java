package com.add.coursemanagement;

import com.add.coursemanagement.dto.CourseDTO;
import com.add.coursemanagement.exception.ApiException;
import com.add.coursemanagement.model.Course;
import com.add.coursemanagement.repository.ActivityRepository;
import com.add.coursemanagement.repository.CourseRepository;
import com.add.coursemanagement.repository.WeekRepository;
import com.add.coursemanagement.services.IRestService;
import com.add.coursemanagement.services.impl.CourseService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static com.google.inject.matcher.Matchers.any;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.keycloak.KeyPairVerifier.verify;
import static org.mockito.Mockito.*;

@SpringBootTest
class CourseManagementApplicationTests {

//    @Mock
//    private CourseRepository courseRepository;
//
//    @Mock
//    private IRestService iRestService;
//
//    @Mock
//    private WeekRepository weekRepository;
//
//    @Mock
//    private ActivityRepository activityRepository;
//
//    @InjectMocks
//    private CourseService courseService;
//
//    @Test
//    void testCreateCourseSuccess() {
//        // Arrange
//        CourseDTO courseDTO = new CourseDTO();
//        courseDTO.setUserId("existingUserId");
//
//        when(iRestService.getActiveUserIds()).thenReturn((List<String>) Set.of("existingUserId"));
////        when(courseRepository.save(any())).thenReturn(new Course());
//        when(courseRepository.save(any(Course.class))).thenReturn(new Course());
//
//
//        // Act
//        Optional<Course> result = courseService.createCourse(courseDTO);
//
//        // Assert
//        assertTrue(result.isPresent(), "Course creation should be successful");
//        verify(courseRepository.toString(), times(1).toString()).save(any());
//    }
//
//    @Test
//    void testCreateCourseUserNotFound() {
//        // Arrange
//        CourseDTO courseDTO = new CourseDTO();
//        courseDTO.setUserId("nonExistingUserId");
//
//        when(iRestService.getActiveUserIds()).thenReturn(Set.of("existingUserId"));
//
//        // Act and Assert
//        assertThrows(ApiException.class, () -> courseService.createCourse(courseDTO), "User not found exception should be thrown");
//        verify(courseRepository, never()).save(any());
//    }

}
