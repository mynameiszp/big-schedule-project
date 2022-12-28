package com.example.springschedule.controller;

import com.example.springschedule.entity.FAQEntity;
import com.example.springschedule.service.FAQService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/api")

public class FAQController {
    private final FAQService faqService;

    public FAQController(FAQService faqService) {
        this.faqService = faqService;
    }

    @GetMapping("/faqs")
    public List<FAQEntity> findAllFAQs(){
        return faqService.findAllFAQs();
    }

    @GetMapping("/faqs/{id}")
    public Optional<FAQEntity> findFAQById(@PathVariable("id") Long id){
        return faqService.findFAQById(id);
    }

    @PostMapping("/faqsSave")
    public FAQEntity saveFAQ(@RequestBody FAQEntity faqEntity){
        return faqService.saveFAQ(faqEntity);
    }

    @PutMapping("/faqsUpdate")
    public FAQEntity updateFAQ(@RequestBody FAQEntity faqEntity){
        return faqService.updateFAQ(faqEntity);
    }

    @DeleteMapping("/faqsDelete/{id}")
    public void deleteFAQ(@PathVariable("id") Long id){
        faqService.deleteFAQ(id);
    }
}
