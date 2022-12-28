package com.example.springschedule.service;

import com.example.springschedule.entity.ScheduleEntity;

import java.util.List;
import java.util.Optional;

public interface ScheduleService {
    List<ScheduleEntity> findAllSchedules();
    Optional<ScheduleEntity> findScheduleById(Long id);
    ScheduleEntity saveSchedule(ScheduleEntity scheduleEntity);
    ScheduleEntity updateSchedule(ScheduleEntity scheduleEntity);
    void deleteSchedule(Long id);
}
