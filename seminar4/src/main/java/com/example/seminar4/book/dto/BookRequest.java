package com.example.seminar4.book.dto;

import lombok.*;

public class BookRequest {
    @Getter
    @Builder
    @NoArgsConstructor @AllArgsConstructor
    public static class BookCreateRequest{
        private String title;
        //builer랑 static으로 인해서 seter를 안씀?
        // 객체를 return하기 위해 setter를 쓰는데 static이랑 builder가 있으면 setter처럼 쓸 수 있음.
        //내부 클래스를 설정해서 request와 관련된 것들을 함
    }
}
