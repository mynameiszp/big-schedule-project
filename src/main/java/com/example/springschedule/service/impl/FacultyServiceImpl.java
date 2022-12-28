package com.example.springschedule.service.impl;

import com.example.springschedule.entity.FacultyEntity;
import com.example.springschedule.repository.FacultyRepository;
import com.example.springschedule.service.FacultyService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public List<FacultyEntity> findAllFaculties() {
        return facultyRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Optional<FacultyEntity> findFacultyById(Long id) {
        return facultyRepository.findById(id);
    }

    @Override
    public FacultyEntity saveFaculty(FacultyEntity facultyEntity) {
        return facultyRepository.save(facultyEntity);
    }

    @Override
    public FacultyEntity updateFaculty(FacultyEntity facultyEntity) {
        return facultyRepository.save(facultyEntity);
    }

    @Override
    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }
}
