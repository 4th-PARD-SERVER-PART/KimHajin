package com.example.hw2.lesson.repository;

import com.example.hw2.lesson.dto.LessonDto;
import com.example.hw2.lesson.entity.Lesson;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class LessonRepository {
    private static final Map<String, Lesson> lessonList = new HashMap<>();

    public void saveLesson(LessonDto lessonDto){
        Lesson lesson = Lesson.builder()
                .lessonName(lessonDto.getLessonName())
                .lessonCredit(lessonDto.getLessonCredit())
                .lessonCategory(lessonDto.getLessonCategory())
                .build();
        lessonList.put(lessonDto.getLessonName(), lesson);
    }

    public LessonDto findByname(String lessonName){
        Lesson lesson = lessonList.get(lessonName);
        return LessonDto.builder()
                .lessonName(lesson.getLessonName())
                .lessonCredit(lesson.getLessonCredit())
                .lessonCategory(lesson.getLessonCategory())
                .build();
    }

    public List<LessonDto> findByCategory(String lessonCategory) {
        return lessonList.values().stream()
                .filter(lesson -> lesson.getLessonCategory().equals(lessonCategory))
                .map(lesson -> LessonDto.builder()
                        .lessonName(lesson.getLessonName())
                        .lessonCredit(lesson.getLessonCredit())
                        .lessonCategory(lesson.getLessonCategory())
                        .build())
                .toList();
    }


    public List<LessonDto> findAll(){
        return lessonList.values().stream()
                .map(lesson -> LessonDto.builder()
                        .lessonName(lesson.getLessonName())
                        .lessonCredit(lesson.getLessonCredit())
                        .lessonCategory(lesson.getLessonCategory())
                        .build()).toList();
    }

    public void updateByName(String lessonName, LessonDto lessonDto){
        Lesson lesson = lessonList.get(lessonName);

        lesson.updateLesson(lessonDto.getLessonName(), lessonDto.getLessonCredit(), lessonDto.getLessonCategory());
    }

    public void deleteByName(String lessonName){
        lessonList.remove(lessonName);
    }
}
