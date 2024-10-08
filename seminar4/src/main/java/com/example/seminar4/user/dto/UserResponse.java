package com.example.seminar4.user.dto;

import com.example.seminar4.book.dto.BookResponse;
import com.example.seminar4.card.dto.CradResponse;
import com.example.seminar4.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class UserResponse {
    @Getter
    @Builder
    @NoArgsConstructor @AllArgsConstructor
    public static class ReadUser{
        private String name;
        private List<BookResponse.BookReadResponse> books;
        private CradResponse.CardReadResponse card;

        public static ReadUser from(User u){
            return new ReadUser(u.getName(),
                    BookResponse.BookReadResponse.bookToDto(u.getBook()),
                    CradResponse.CardReadResponse.from(u.getCard()));
        }

//        public static ReadUser of(User u){
//            return ReadUser.builder()
//                    .name(u.getName())
//                    .books(BookResponse.BookReadResponse.bookToDto(u.getBook()))
//                    .build();
//        }//빌더로 쓰면 이렇게 됨.
    }

}

