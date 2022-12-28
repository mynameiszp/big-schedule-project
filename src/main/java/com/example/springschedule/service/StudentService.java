package com.example.springschedule.service;

import com.example.springschedule.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<StudentEntity> findAllStudents();
    Optional<StudentEntity> findStudentById(Long id);
    StudentEntity saveStudent(StudentEntity studentEntity);
    StudentEntity updateStudent(StudentEntity studentEntity);
    void deleteStudent(Long id);
}
