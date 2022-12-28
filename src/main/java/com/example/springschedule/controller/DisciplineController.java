package com.example.springschedule.controller;

import com.example.springschedule.entity.DisciplineEntity;
import com.example.springschedule.service.DisciplineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/api")

public class DisciplineController {
    private final DisciplineService disciplineService;

    public DisciplineController(DisciplineService disciplineService) {
        this.disciplineService = disciplineService;
    }

    @GetMapping("/disciplines")
    public List<DisciplineEntity> findAllDisciplines(){
        return disciplineService.findAllDisciplines();
    }

    @GetMapping("/disciplines/{id}")
    public Optional<DisciplineEntity> findDisciplineById(@PathVariable("id") Long id){
        return disciplineService.findDisciplineById(id);
    }

    @PostMapping("/disciplinesSave")
    public DisciplineEntity saveDiscipline(@RequestBody DisciplineEntity disciplineEntity){
        return disciplineService.saveDiscipline(disciplineEntity);
    }

    @PutMapping("/disciplinesUpdate")
    public DisciplineEntity updateDiscipline(@RequestBody DisciplineEntity disciplineEntity){
        return disciplineService.updateDiscipline(disciplineEntity);
    }

    @DeleteMapping("/disciplinesDelete/{id}")
    public void deleteDiscipline(@PathVariable("id") Long id){
        disciplineService.deleteDiscipline(id);
    }
}
