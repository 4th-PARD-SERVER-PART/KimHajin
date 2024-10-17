package com.example.hw4.post.service;

import com.example.hw4.post.dto.PostRequestDto;
import com.example.hw4.post.entity.Post;
import com.example.hw4.post.repo.PostRepo;
import com.example.hw4.user.dto.UserResponseDto;
import com.example.hw4.user.entity.User;
import com.example.hw4.user.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final UserRepo userRepo;
    private final PostRepo postRepo;

    public void createPost(Long userid, PostRequestDto.PostCreateRequest req){
        Optional<User> u = userRepo.findById(userid);
        User user = u.get();
        Post post = Post.form(req.getTitle(), req.getContent(), user);
        postRepo.save(post);
    }
}
