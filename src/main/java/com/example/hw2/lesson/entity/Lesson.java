package com.example.hw2.lesson.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lesson {
    private String lessonName;
    private Integer lessonCredit;
    private String lessonCategory;

    public void updateLesson(String lessonName, Integer lessonCredit, String lessonCategory){
        this.lessonName = lessonName;
        this.lessonCredit = lessonCredit;
        this.lessonCategory = lessonCategory;
    }
}
