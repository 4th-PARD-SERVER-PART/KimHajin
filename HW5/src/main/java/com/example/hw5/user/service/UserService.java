package com.example.hw5.user.service;

import com.example.hw5.post.dto.PostResponseDto;
import com.example.hw5.user.dto.UserRequestDto;
import com.example.hw5.user.dto.UserResponseDto;
import com.example.hw5.user.entity.User;
import com.example.hw5.user.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

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

    public void patchUser(Long userId, UserRequestDto.UserPatchRequest req){
        Optional<User> u = userRepo.findById(userId);
        User user = u.get();

        user.setUser(req.getName(), req.getEmail());
        userRepo.save(user);
    }

    public void deleteUser(Long userId){
        Optional<User> u = userRepo.findById(userId);
        User user = u.get();
        userRepo.delete(user);
    }
}
