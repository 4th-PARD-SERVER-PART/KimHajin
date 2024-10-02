package com.example.hw3.Buger.repository;

import com.example.hw3.Buger.entity.Buger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BugerRepository extends JpaRepository<Buger, Long > {
}
