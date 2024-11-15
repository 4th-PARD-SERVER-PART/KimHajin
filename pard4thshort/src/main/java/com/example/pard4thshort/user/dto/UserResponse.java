package com.example.pard4thshort.user.dto;

import com.example.pard4thshort.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

public class UserResponse {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserRead {
        private Integer id;
        private String name;
        private String dateinfo;
        private List<String> answers;

        // User 엔티티를 UserRead DTO로 변환
        public static UserRead from(User user) {
            return new UserRead(
                    user.getId(),
                    user.getName(),
                    user.getDateinfo(),
                    user.getAnswer()// 변환된 Answer 리스트 사용
            );
        }

    }
}
