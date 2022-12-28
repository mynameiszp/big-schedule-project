package com.example.springschedule.controller;

import com.example.springschedule.entity.DepartmentEntity;
import com.example.springschedule.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/api")

public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/departments")
    public List<DepartmentEntity> findAllDepartments(){
        return departmentService.findAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Optional<DepartmentEntity> findDepartmentById(@PathVariable("id") Long id){
        return departmentService.findDepartmentById(id);
    }

    @PostMapping("/departmentsSave")
    public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity departmentEntity){
        return departmentService.saveDepartment(departmentEntity);
    }

    @PutMapping("/departmentsUpdate")
    public DepartmentEntity updateDepartment(@RequestBody DepartmentEntity departmentEntity){
        return departmentService.updateDepartment(departmentEntity);
    }

    @DeleteMapping("/departmentsDelete/{id}")
    public void deleteDepartment(@PathVariable("id") Long id){
        departmentService.deleteDepartment(id);
    }
}
