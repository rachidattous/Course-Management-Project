package com.add.coursemanagement.specification;

import com.add.coursemanagement.constants.State;
import com.add.coursemanagement.dto.SearchCourseDTO;
import com.add.coursemanagement.model.Course;
import lombok.experimental.UtilityClass;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;
import java.util.stream.Stream;

@UtilityClass
public class CourseSpecification {

    private String like(String element) {
        return Optional.ofNullable(element).map(e -> "%" + e + "%").orElse("");
    }

    private Optional<Specification<Course>> distinct() {
        return Optional.of((root, query, builder) -> {
            query.distinct(true);
            return builder.isNotNull(root.get("userId"));
        });
    }

    private Optional<Specification<Course>> hasCreatedDate(LocalDate createdDate) {
        return Optional.ofNullable(createdDate)
                .map(CourseSpecification::hasCreatedDateImpl)
                .orElse(Optional.empty());

    }

    private Optional<Specification<Course>> hasCreatedDateImpl(LocalDate createdDate) {
        return Optional.of((root, query, builder) -> builder.equal(root.get("createdDate"), createdDate));
    }

    private Optional<Specification<Course>> hasCreatedTime(LocalTime createdTime) {
        return Optional.ofNullable(createdTime)
                .map(CourseSpecification::hasCreatedTimeImpl)
                .orElse(Optional.empty());
    }

    private Optional<Specification<Course>> hasCreatedTimeImpl(LocalTime createdTime) {
        return Optional.of((root, query, builder) -> builder.equal(root.get("createdTime"), createdTime));
    }

    private Optional<Specification<Course>> hasLastModifiedDate(LocalDate lastModifiedDate) {
        return Optional.ofNullable(lastModifiedDate)
                .map(CourseSpecification::hasLastModifiedDateImpl)
                .orElse(Optional.empty());
    }


    private Optional<Specification<Course>> hasLastModifiedDateImpl(LocalDate lastModifiedDate) {
        return Optional.of((root, query, builder) -> builder.equal(root.get("lastModifiedDate"), lastModifiedDate));
    }

    private Optional<Specification<Course>> hasLastModifiedTime(LocalTime lastModifiedTime) {
        return Optional.ofNullable(lastModifiedTime)
                .map(CourseSpecification::hasLastModifiedTimeImpl)
                .orElse(Optional.empty());
    }

    private Optional<Specification<Course>> hasLastModifiedTimeImpl(LocalTime lastModifiedTime) {
        return Optional.of((root, query, builder) -> builder.equal(root.get("lastModifiedTime"), lastModifiedTime));
    }

    private Optional<Specification<Course>> hasState(State state) {
        return Optional.ofNullable(state)
                .map(CourseSpecification::hasStateImpl)
                .orElse(Optional.empty());
    }

    private Optional<Specification<Course>> hasStateImpl(State state) {
        return Optional.of((root, query, builder) -> builder.equal(root.get("state"), state));
    }

    private Optional<Specification<Course>> hasTitle(String title) {
        return Optional.ofNullable(title)
                .map(CourseSpecification::hasTitleImpl)
                .orElse(Optional.empty());

    }

    private Optional<Specification<Course>> hasTitleImpl(String title) {
        return Optional.of((root, query, builder) -> builder.like(root.get("title"), like(title)));
    }

    private Optional<Specification<Course>> hasSummary(String summary) {
        return Optional.ofNullable(summary)
                .map(CourseSpecification::hasSummaryImpl)
                .orElse(Optional.empty());
    }

    private Optional<Specification<Course>> hasSummaryImpl(String summary) {
        return Optional.of((root, query, builder) -> builder.like(root.get("summary"), like(summary)));
    }

    public Specification<Course> searchRequest(SearchCourseDTO searchCourseDTO) {

        return Stream.of(
                    hasCreatedDate(searchCourseDTO.getCreatedDate()),
                    hasCreatedTime(searchCourseDTO.getCreatedTime()),
                    hasLastModifiedDate(searchCourseDTO.getLastModifiedDate()),
                    hasLastModifiedTime(searchCourseDTO.getLastModifiedTime()),
                    hasState(searchCourseDTO.getState()),
                    hasTitle(searchCourseDTO.getTitle()),
                    hasSummary(searchCourseDTO.getSummary()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .reduce(Specification.where(distinct().get()), Specification::and);

    }

}
