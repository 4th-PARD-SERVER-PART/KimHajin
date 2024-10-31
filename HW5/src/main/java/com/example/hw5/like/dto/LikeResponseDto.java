package com.example.hw5.like.dto;

import com.example.hw5.like.entity.Like;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class LikeResponseDto {
    @Getter
    @Builder
    @NoArgsConstructor @AllArgsConstructor
    public static class LikeRead{
        private Long likeId;

        public static LikeRead from(Like like) {
            return new LikeRead(
                    like.getId()
            );
        }

    }
}
