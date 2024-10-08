package com.example.seminar4.card.dto;

import com.example.seminar4.card.entity.Card;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class CradResponse {
    @Getter
    @Builder
    @NoArgsConstructor @AllArgsConstructor
    public static class CardReadResponse{
        private Long cardId;
        private String name;

        public static CardReadResponse from(Card c) {
            return new CardReadResponse(c.getId(), c.getName());
        }
    }
}
