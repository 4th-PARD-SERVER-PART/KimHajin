package com.example.hw2.lesson.service;

import com.example.hw2.lesson.dto.LessonDto;
import com.example.hw2.lesson.repository.LessonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LessonService {
    private final LessonRepository lessonRepository;
    public void saveLesson(LessonDto lessonDto){
        lessonRepository.saveLesson(lessonDto);
    }

    public LessonDto findByname(String lessonName){
        return lessonRepository.findByname(lessonName);
    }

    public List<LessonDto> findByCategory(String lessonCategory){
        return lessonRepository.findByCategory(lessonCategory);
    }

    public List<LessonDto> findAll(){
        return lessonRepository.findAll();
    }

    public void updateByName(String lessonName, LessonDto lessonDto){
        lessonRepository.updateByName(lessonName, lessonDto);
    }

    public void deleteByName(String lessonName){
        lessonRepository.deleteByName(lessonName);
    }
}

