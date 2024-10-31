package com.example.hw5.user.dto;

import com.example.hw5.post.dto.PostResponseDto;
import com.example.hw5.post.entity.Post;
import com.example.hw5.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

public class UserResponseDto {

    public static List<PostResponseDto.PostRead> convertPostList(List<Post> posts) {
        return posts.stream()
                .map(PostResponseDto.PostRead::from)
                .collect(Collectors.toList());
    }

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
                    convertPostList(user.getPosts())  // 변환된 Post 리스트 사용
            );
        }

    }


}
