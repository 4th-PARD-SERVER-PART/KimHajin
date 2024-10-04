package com.example.hw3.Buger.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BugerDto {

    private String burgerName;
    private Long burgerPrice;

}
