package com.example.seminar4.card.repository;

import com.example.seminar4.card.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}