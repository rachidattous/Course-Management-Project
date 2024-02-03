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
import org.keycloak.common.VerificationException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@SpringBootTest
class CourseManagementApplicationTests {

    @Mock
    private CourseRepository courseRepository;

    @Mock
    private IRestService iRestService;

    @Mock
    private WeekRepository weekRepository;

    @Mock
    private ActivityRepository activityRepository;

    @InjectMocks
    private CourseService courseService;

    @Test
    void testCreateCourseSuccess() throws VerificationException {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setUserId("existingUserId");

        when(iRestService.getActiveUserIds()).thenReturn((List<String>) Set.of("existingUserId"));
        when(courseRepository.save(Mockito.<Course>any())).thenReturn(new Course());

        // Act
        Optional<Course> result = courseService.createCourse(courseDTO);

        // Assert
        assertTrue(result.isPresent(), "Course creation should be successful");

        // Verify that the 'save' method was called once with any Course parameter
        verify(courseRepository, times(1)).save(Mockito.<Course>any());

    }


}
