package com.example.hw2.lesson.controller;

import com.example.hw2.lesson.dto.LessonDto;
import com.example.hw2.lesson.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lesson")
public class LessonController {
    private final LessonService lessonService;

    //과목정보 저장
    @PostMapping("")
    public String saveLesson(@RequestBody LessonDto lessonDto){
        lessonService.saveLesson(lessonDto);
        return "저장되었습니다.";
    }

    //과목정보 불러오기
    @GetMapping("/1")
    public LessonDto findByname(@RequestParam String lessonName ){
        return lessonService.findByname(lessonName);
    }

    //카테고리에 있는 과목 정보 불러오기
    @GetMapping("/2")
    public List<LessonDto> findByCategory(@RequestParam String lessonCategory){
        return lessonService.findByCategory(lessonCategory);
    }

    //과목 리스트 불러오기
    @GetMapping("")
    public List<LessonDto> findAll(){
        return lessonService.findAll();
    }

    //과목 정보 수정하기
    @PatchMapping("")
    public String updateByName(@RequestParam String lessonName, @RequestBody LessonDto lessonDto){
        lessonService.updateByName(lessonName, lessonDto);
        return "수정되었습니다.";
    }

    //과목 삭제하기
    @DeleteMapping("")
    public String deleteByName(@RequestParam String lessonName){
        lessonService.deleteByName(lessonName);
        return "삭제되었습니다.";
    }
}
