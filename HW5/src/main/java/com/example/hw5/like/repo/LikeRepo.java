package com.example.hw5.like.repo;

import com.example.hw5.like.entity.Like;
import com.example.hw5.post.entity.Post;
import com.example.hw5.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepo extends JpaRepository<Like, Long> {

    Optional<Like> findByUserAndPost(User user, Post post);
}
