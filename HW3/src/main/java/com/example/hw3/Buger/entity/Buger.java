package com.example.hw3.Buger.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Buger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bugerId;

    @Column(name = "name")
    private String bugerName;

    @Column(name = "price" , length = 20)
    private Long bugerPrice;

    @CreationTimestamp
    private Timestamp bugerSignupTime;

    public void update(String bugerName, Long bugerPrice){
        this.bugerName = bugerName;
        this.bugerPrice = bugerPrice;
    }
}
