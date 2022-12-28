package com.example.springschedule.service.impl;

import com.example.springschedule.entity.StudentEntity;
import com.example.springschedule.repository.StudentRepository;
import com.example.springschedule.service.StudentService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentEntity> findAllStudents() {
        return studentRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Optional<StudentEntity> findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public StudentEntity saveStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
