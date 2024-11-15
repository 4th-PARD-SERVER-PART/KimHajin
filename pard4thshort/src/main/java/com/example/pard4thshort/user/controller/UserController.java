package com.example.pard4thshort.user.controller;

import com.example.pard4thshort.user.dto.UserRequest;
import com.example.pard4thshort.user.dto.UserResponse;
import com.example.pard4thshort.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private  final UserService userService;

    @PostMapping("")
    public ResponseEntity<String> createUser(@RequestBody UserRequest.UserCreateRequest req) {
        String response = userService.createUser(req);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse.UserRead> getUser(@PathVariable Integer id) {
        UserResponse.UserRead userResponse = userService.getUser(id);
        return ResponseEntity.ok(userResponse);
    }
}
