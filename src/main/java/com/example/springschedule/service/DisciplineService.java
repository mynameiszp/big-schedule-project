package com.example.springschedule.service;

import com.example.springschedule.entity.DisciplineEntity;

import java.util.List;
import java.util.Optional;

public interface DisciplineService {
    List<DisciplineEntity> findAllDisciplines();
    Optional<DisciplineEntity> findDisciplineById(Long id);
    DisciplineEntity saveDiscipline(DisciplineEntity disciplineEntity);
    DisciplineEntity updateDiscipline(DisciplineEntity disciplineEntity);
    void deleteDiscipline(Long id);
}
