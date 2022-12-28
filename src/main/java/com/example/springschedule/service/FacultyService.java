package com.example.springschedule.service;

import com.example.springschedule.entity.FacultyEntity;

import java.util.List;
import java.util.Optional;

public interface FacultyService {
    List<FacultyEntity> findAllFaculties();
    Optional<FacultyEntity> findFacultyById(Long id);
    FacultyEntity saveFaculty(FacultyEntity facultyEntity);
    FacultyEntity updateFaculty(FacultyEntity facultyEntity);
    void deleteFaculty(Long id);
}
