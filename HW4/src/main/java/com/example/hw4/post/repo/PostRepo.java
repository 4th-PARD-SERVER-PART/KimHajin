package com.example.hw4.post.repo;

import com.example.hw4.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}
