package com.example.springschedule.controller;

import com.example.springschedule.entity.StudentEntity;
import com.example.springschedule.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/api")

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<StudentEntity> findAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<StudentEntity> findStudentById(@PathVariable("id") Long id){
        return studentService.findStudentById(id);
    }

    @PostMapping("/studentsSave")
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity){
        return studentService.saveStudent(studentEntity);
    }

    @PutMapping("/studentsUpdate")
    public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity){
        return studentService.updateStudent(studentEntity);
    }

    @DeleteMapping("/studentsDelete/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }
}
