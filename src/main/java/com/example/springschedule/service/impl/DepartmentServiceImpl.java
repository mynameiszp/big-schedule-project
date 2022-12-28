package com.example.springschedule.service.impl;

import com.example.springschedule.entity.DepartmentEntity;
import com.example.springschedule.entity.FAQEntity;
import com.example.springschedule.repository.DepartmentRepository;
import com.example.springschedule.service.DepartmentService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<DepartmentEntity> findAllDepartments() {
        return departmentRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Optional<DepartmentEntity> findDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    @Override
    public DepartmentEntity updateDepartment(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
