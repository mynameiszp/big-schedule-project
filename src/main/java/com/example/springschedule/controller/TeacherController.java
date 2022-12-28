package com.example.springschedule.controller;

import com.example.springschedule.entity.TeacherEntity;
import com.example.springschedule.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/api")

public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    @GetMapping("/teachers")
    public List<TeacherEntity> findAllTeachers(){
        return teacherService.findAllTeachers();
    }

    @GetMapping("/teachers/{id}")
    public Optional<TeacherEntity> findTeacherById(@PathVariable("id") Long id){
        return teacherService.findTeacherById(id);
    }

    @PostMapping("/teachersSave")
    public TeacherEntity saveTeacher(@RequestBody TeacherEntity teacherEntity){
        return teacherService.saveTeacher(teacherEntity);
    }

    @PutMapping("/teachersUpdate")
    public TeacherEntity updateTeacher(@RequestBody TeacherEntity teacherEntity){
        return teacherService.updateTeacher(teacherEntity);
    }

    @DeleteMapping("/teachersDelete/{id}")
    public void deleteTeacher(@PathVariable("id") Long id){
        teacherService.deleteTeacher(id);
    }
}
