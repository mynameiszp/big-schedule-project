package com.example.springschedule.service.impl;

import com.example.springschedule.entity.FAQEntity;
import com.example.springschedule.repository.FAQRepository;
import com.example.springschedule.service.FAQService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FAQServiceImpl implements FAQService {

    private final FAQRepository faqRepository;

    public FAQServiceImpl(FAQRepository faqRepository) {
        this.faqRepository = faqRepository;
    }

    @Override
    public List<FAQEntity> findAllFAQs() {
        return faqRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Optional<FAQEntity> findFAQById(Long id) {
        return faqRepository.findById(id);
    }

    @Override
    public FAQEntity saveFAQ(FAQEntity teacherEntity) {
        return faqRepository.save(teacherEntity);
    }

    @Override
    public FAQEntity updateFAQ(FAQEntity teacherEntity) {
        return faqRepository.save(teacherEntity);
    }

    @Override
    public void deleteFAQ(Long id) {
        faqRepository.deleteById(id);
    }
}
