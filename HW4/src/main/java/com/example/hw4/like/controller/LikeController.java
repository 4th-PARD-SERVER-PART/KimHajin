package com.example.hw4.like.controller;

import com.example.hw4.like.dto.LikeRequestDto;
import com.example.hw4.like.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/like")
public class LikeController {
    private final LikeService likeService;

    @PostMapping("/{postId}/{userId}")
    public ResponseEntity<String> createLike (@PathVariable Long postId, @PathVariable Long userId){
        likeService.createLike(postId, userId);
        return ResponseEntity.status(HttpStatus.CREATED).body("저장되었습니다.");
    }
}
