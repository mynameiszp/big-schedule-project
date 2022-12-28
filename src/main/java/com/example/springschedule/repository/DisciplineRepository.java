package com.example.springschedule.repository;

import com.example.springschedule.entity.DisciplineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplineRepository extends JpaRepository<DisciplineEntity, Long> {
}
