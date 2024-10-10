package com.example.hw4.user.controller;

import com.example.hw4.user.dto.UserResponseDto;
import com.example.hw4.user.dto.UserResquestDto;
import com.example.hw4.user.service.UserService;
import lombok.RequiredArgsConstructor;
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
    public void createUser (@RequestBody UserResquestDto.UserCreateRequest req){
        userService.createUser(req);
    }
}
