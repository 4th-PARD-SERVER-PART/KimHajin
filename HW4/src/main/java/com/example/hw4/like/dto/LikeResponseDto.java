package com.example.hw4.like.dto;

import com.example.hw4.like.entity.Like;
import com.example.hw4.post.dto.PostResponseDto;
import com.example.hw4.post.entity.Post;
import com.example.hw4.user.dto.UserResponseDto;
import com.example.hw4.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LikeResponseDto {
    @Getter
    @Builder
    @NoArgsConstructor @AllArgsConstructor
    public static class LikeRead{
        private Long likeId;
        private UserResponseDto.UserRead user;
        private PostResponseDto.PostRead post;

        public static LikeRead from(Like like) {
            return new LikeRead(
                    like.getId(),
                    UserResponseDto.UserRead.from(like.getUser()),
                    PostResponseDto.PostRead.from(like.getPost())
            );
        }
    }
}
