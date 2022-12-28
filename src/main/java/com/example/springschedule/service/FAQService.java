package com.example.springschedule.service;

import com.example.springschedule.entity.FAQEntity;

import java.util.List;
import java.util.Optional;

public interface FAQService {
    List<FAQEntity> findAllFAQs();
    Optional<FAQEntity> findFAQById(Long id);
    FAQEntity saveFAQ(FAQEntity teacherEntity);
    FAQEntity updateFAQ(FAQEntity teacherEntity);
    void deleteFAQ(Long id);
}
