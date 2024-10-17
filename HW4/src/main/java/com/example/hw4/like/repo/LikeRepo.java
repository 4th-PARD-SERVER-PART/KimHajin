package com.example.hw4.like.repo;

import com.example.hw4.like.entity.Like;
import com.example.hw4.post.entity.Post;
import com.example.hw4.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepo extends JpaRepository<Like, Long> {

    Optional<Like> findByUserAndPost(User user, Post post);
}
