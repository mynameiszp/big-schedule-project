package com.example.springschedule.service.impl;

import com.example.springschedule.entity.ScheduleEntity;
import com.example.springschedule.repository.ScheduleRepository;
import com.example.springschedule.service.ScheduleService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public List<ScheduleEntity> findAllSchedules() {
        return scheduleRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Optional<ScheduleEntity> findScheduleById(Long id) {
        return scheduleRepository.findById(id);
    }

    @Override
    public ScheduleEntity saveSchedule(ScheduleEntity scheduleEntity) {
        return scheduleRepository.save(scheduleEntity);
    }

    @Override
    public ScheduleEntity updateSchedule(ScheduleEntity scheduleEntity) {
        return scheduleRepository.save(scheduleEntity);
    }

    @Override
    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
