package com.example.hw4.post.dto;


import com.example.hw4.like.dto.LikeResponseDto;
import com.example.hw4.post.entity.Post;
import com.example.hw4.like.entity.Like;
import com.example.hw4.user.dto.UserResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

public class PostResponseDto {
    @Getter
    @Builder
    @NoArgsConstructor @AllArgsConstructor
    public static class PostRead{
        private String title;
        private String content;
        private int likeCount;

        public static PostRead from(Post post){
            return new PostRead(
                    post.getTitle(),
                    post.getContent(),
                    countLikes(post)
                    );
        }

        private static int countLikes(Post post) {
            return post.getLikes().size(); //post.getLikes().stream().count() 사용
        }

    }
}
