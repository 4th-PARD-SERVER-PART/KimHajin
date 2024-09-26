package com.example.hw2.lesson.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LessonDto {
    private String lessonName;
    private Integer lessonCredit;
    private String lessonCategory;
}
