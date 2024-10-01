package com.example.thirdseminar.User.controller;

import com.example.thirdseminar.User.dto.UserDto;
import com.example.thirdseminar.User.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("")
    public void save(@RequestBody UserDto userDto){
        userService.save(userDto);
    }

    @GetMapping("/{userId}")
    public UserDto findById(@PathVariable Long userId){
        return userService.read(userId);
    }

    @GetMapping("")
    public List<UserDto> readAll(){
        return  userService.readAll();
    }

    @PatchMapping("/{userId}")
    public void update(@PathVariable Long userId, @RequestBody UserDto userDto){
        userService.update(userId, userDto);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable Long userId){
        userService.delete(userId);
    }

    @GetMapping("/userNum")
    //객체를 담아 돌려주는 것 status를 같이 응답해줄 수 있음.
    //리턴값은 보통 responseEntity를 사용함. 프론트와 협업할 때
    public ResponseEntity<Long> readByEmail (@RequestParam String email){
        Long responseValue = userService.getUserNum(email);
        return new ResponseEntity<>(responseValue, HttpStatus.OK);
    }
}
