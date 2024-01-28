package com.add.courseManagement.services;

import com.add.courseManagement.dto.*;
import com.add.courseManagement.model.*;

import java.util.List;
import java.util.Optional;

public interface IActivityService {

    Optional<Week> createTextActivity(String weekId, TextDTO textDTO);

    Optional<Week> createMultimediaActivity(String weekId, MultimediaDTO multimediaDTO);

    Optional<Week> createContentActivity(String weekId, ContentDTO contentDTO);
    List<Activity> getAll(String weekId);

    Optional<Text> updateTextActivity(String activityId, TextDTO textDTO);

    Optional<Multimedia> updateMultimediaActivity(String activityId, MultimediaDTO multimediaDTO);

    Optional<Content> updateContentActivity(String activityId, ContentDTO contentDTO);

    void deleteActivity(String activityId);

}
