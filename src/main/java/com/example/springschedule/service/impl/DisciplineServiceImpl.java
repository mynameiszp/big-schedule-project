package com.example.springschedule.service.impl;

import com.example.springschedule.entity.DisciplineEntity;
import com.example.springschedule.repository.DisciplineRepository;
import com.example.springschedule.service.DisciplineService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplineServiceImpl implements DisciplineService {

    private final DisciplineRepository disciplineRepository;

    public DisciplineServiceImpl(DisciplineRepository disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    @Override
    public List<DisciplineEntity> findAllDisciplines() {
        return disciplineRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Optional<DisciplineEntity> findDisciplineById(Long id) {
        return disciplineRepository.findById(id);
    }

    @Override
    public DisciplineEntity saveDiscipline(DisciplineEntity disciplineEntity) {
        return disciplineRepository.save(disciplineEntity);
    }

    @Override
    public DisciplineEntity updateDiscipline(DisciplineEntity disciplineEntity) {
        return disciplineRepository.save(disciplineEntity);
    }

    @Override
    public void deleteDiscipline(Long id) {
        disciplineRepository.deleteById(id);
    }
}
