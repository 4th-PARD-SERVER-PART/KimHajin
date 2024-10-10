package com.example.hw4.user.dto;

import com.example.hw4.post.dto.PostResponseDto;
import com.example.hw4.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

public class UserResponseDto {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserRead{
        private Long userId;
        private String username;
        private List<PostResponseDto.PostRead> posts;

        public static UserRead from(User user) {
            return new UserRead(
                    user.getId(),
                    user.getName(),
                    user.getPosts().stream()
                            .map(PostResponseDto.PostRead::from) 
                            .collect(Collectors.toList())
            );
        }
    }


}
