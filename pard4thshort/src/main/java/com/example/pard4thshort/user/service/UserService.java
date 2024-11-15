package com.example.pard4thshort.user.service;

import com.example.pard4thshort.user.dto.UserRequest;
import com.example.pard4thshort.user.dto.UserResponse;
import com.example.pard4thshort.user.entity.User;
import com.example.pard4thshort.user.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public String createUser(UserRequest.UserCreateRequest req) {
        User user = new User(null,req.getName(), req.getDateinfo(), req.getAnswer());

        try {
            userRepo.save(user);
            return "User created successfully!";
        } catch (Exception e) {
            return "Error while creating user: " + e.getMessage();
        }
    }


    public UserResponse.UserRead getUser(Integer userId) {
       Optional<User> u = userRepo.findById(userId);
        User user = u.get();
        UserResponse.UserRead ret = UserResponse.UserRead.from(user);
        return ret;

    }
}
