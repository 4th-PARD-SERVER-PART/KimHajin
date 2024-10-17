package com.example.hw4.user.controller;

import com.example.hw4.user.dto.UserResponseDto;
import com.example.hw4.user.dto.UserRequestDto;
import com.example.hw4.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponseDto.UserRead> getUser (@PathVariable Long userId){
       return ResponseEntity.ok(userService.readUser(userId));
    }

    @PostMapping("")
    public ResponseEntity<String> createUser (@RequestBody UserRequestDto.UserCreateRequest req){
        userService.createUser(req);
        return ResponseEntity.status(HttpStatus.CREATED).body("저장되었습니다.");
    }
}
