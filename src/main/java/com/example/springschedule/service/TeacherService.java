package com.example.springschedule.service;

import com.example.springschedule.entity.TeacherEntity;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    List<TeacherEntity> findAllTeachers();
    Optional<TeacherEntity> findTeacherById(Long id);
    TeacherEntity saveTeacher(TeacherEntity teacherEntity);
    TeacherEntity updateTeacher(TeacherEntity teacherEntity);
    void deleteTeacher(Long id);
}
