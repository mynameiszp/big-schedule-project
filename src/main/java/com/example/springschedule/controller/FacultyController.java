package com.example.springschedule.controller;

import com.example.springschedule.entity.FacultyEntity;
import com.example.springschedule.service.FacultyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/api")

public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("/faculties")
    public List<FacultyEntity> findAllFaculties(){
        return facultyService.findAllFaculties();
    }

    @GetMapping("/faculties/{id}")
    public Optional<FacultyEntity> findFacultyById(@PathVariable("id") Long id){
        return facultyService.findFacultyById(id);
    }

    @PostMapping("/facultiesSave")
    public FacultyEntity saveFaculty(@RequestBody FacultyEntity facultyEntity){
        return facultyService.saveFaculty(facultyEntity);
    }

    @PutMapping("/facultiesUpdate")
    public FacultyEntity updateFaculty(@RequestBody FacultyEntity facultyEntity){
        return facultyService.updateFaculty(facultyEntity);
    }

    @DeleteMapping("/facultiesDelete/{id}")
    public void deleteFaculty(@PathVariable("id") Long id){
        facultyService.deleteFaculty(id);
    }
}
