package com.example.hw4.user.service;

import com.example.hw4.post.dto.PostResponseDto;
import com.example.hw4.user.dto.UserResponseDto;
import com.example.hw4.user.dto.UserRequestDto;
import com.example.hw4.user.entity.User;
import com.example.hw4.user.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public void createUser(UserRequestDto.UserCreateRequest req){
        User user = new User(null, req.getName(), req.getPosts());
        userRepo.save(user);
    }

    public UserResponseDto.UserRead readUser(Long userId){
        Optional<User> u = userRepo.findById(userId);
        User user = u.get();
        UserResponseDto.UserRead ret = UserResponseDto.UserRead.from(user);
        return ret;
    }

    public List<PostResponseDto.PostRead> postfindByuserId(Long userId){
        Optional<User> u = userRepo.findById(userId);
        User user = u.get();
        return UserResponseDto.convertPostList(user.getPosts());
    }
}
