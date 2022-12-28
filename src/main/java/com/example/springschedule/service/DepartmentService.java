package com.example.springschedule.service;

import com.example.springschedule.entity.DepartmentEntity;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<DepartmentEntity> findAllDepartments();
    Optional<DepartmentEntity> findDepartmentById(Long id);
    DepartmentEntity saveDepartment(DepartmentEntity departmentEntity);
    DepartmentEntity updateDepartment(DepartmentEntity departmentEntity);
    void deleteDepartment(Long id);
}
