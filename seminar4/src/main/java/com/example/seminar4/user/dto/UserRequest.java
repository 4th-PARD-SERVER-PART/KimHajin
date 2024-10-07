package com.example.seminar4.user.dto;

import com.example.seminar4.book.entity.Book;
import com.example.seminar4.user.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class UserRequest {
    @Getter
    @Builder
    @NoArgsConstructor @AllArgsConstructor
    public static class UserReadRequest{
        private Long id;
        private String name;
        private List<Book> books;

        public static UserReadRequest from(User u){
            return  new UserReadRequest(u.getId(), u.getName(), u.getBook());
        }//메소드임 만약에 builder 사용해서 하는 것이였지만 이제 생성자를 이렇게 써보자
        //프론트에서 엔티티 객체에서 dto로 만들어서 받기
    }

    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)//book 개체가 빈값이라면 null값을 넣어서 만들어줘
    @NoArgsConstructor @AllArgsConstructor
    public static class UserCreateRequest{
        private String name;
        private List<Book> books;
    }
}
