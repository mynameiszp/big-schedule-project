package com.example.springschedule.controller;

import com.example.springschedule.entity.ScheduleEntity;
import com.example.springschedule.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/api")

public class ScheduleController {
    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/schedules")
    public List<ScheduleEntity> findAllSchedules(){
        return scheduleService.findAllSchedules();
    }

    @GetMapping("/schedules/{id}")
    public Optional<ScheduleEntity> findScheduleById(@PathVariable("id") Long id){
        return scheduleService.findScheduleById(id);
    }

    @PostMapping("/schedulesSave")
    public ScheduleEntity saveSchedule(@RequestBody ScheduleEntity scheduleEntity){
        return scheduleService.saveSchedule(scheduleEntity);
    }

    @PutMapping("/schedulesUpdate")
    public ScheduleEntity updateSchedule(@RequestBody ScheduleEntity scheduleEntity){
        return scheduleService.updateSchedule(scheduleEntity);
    }

    @DeleteMapping("/schedulesDelete/{id}")
    public void deleteSchedule(@PathVariable("id") Long id){
        scheduleService.deleteSchedule(id);
    }
}
