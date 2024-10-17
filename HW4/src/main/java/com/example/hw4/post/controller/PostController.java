package com.example.hw4.post.controller;

import com.example.hw4.post.dto.PostRequestDto;
import com.example.hw4.post.service.PostService;
import com.example.hw4.user.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @PostMapping("/{userId}")
    public ResponseEntity<String> createUser (@PathVariable Long userId, @RequestBody PostRequestDto.PostCreateRequest req){
        postService.createPost(userId, req);
        return ResponseEntity.status(HttpStatus.CREATED).body("저장되었습니다.");
    }
}
