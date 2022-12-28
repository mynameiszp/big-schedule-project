package com.example.springschedule.service.impl;

import com.example.springschedule.entity.TeacherEntity;
import com.example.springschedule.repository.TeacherRepository;
import com.example.springschedule.service.TeacherService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<TeacherEntity> findAllTeachers() {
        return teacherRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Optional<TeacherEntity> findTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public TeacherEntity saveTeacher(TeacherEntity teacherEntity) {
        return teacherRepository.save(teacherEntity);
    }

    @Override
    public TeacherEntity updateTeacher(TeacherEntity teacherEntity) {
        return teacherRepository.save(teacherEntity);
    }

    @Override
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
