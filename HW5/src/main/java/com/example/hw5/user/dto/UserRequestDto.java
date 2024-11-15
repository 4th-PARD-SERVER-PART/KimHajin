package com.example.hw5.user.dto;

import com.example.hw5.post.entity.Post;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class UserRequestDto {
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor @AllArgsConstructor
    public static class UserCreateRequest{
        private String name;
        private String email;
        private List<Post> posts;
    }

    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor @AllArgsConstructor
    public static class UserPatchRequest{
        private String name;
        private String email;
    }
}