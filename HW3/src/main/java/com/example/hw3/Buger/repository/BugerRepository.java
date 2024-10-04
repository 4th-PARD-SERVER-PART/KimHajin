package com.example.hw3.Buger.repository;

import com.example.hw3.Buger.entity.Buger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BugerRepository extends JpaRepository<Buger, Long > {

    List<Buger> findBurgerByBurgerPriceGreaterThan(@Param("price") Long price);

    List<Buger> findBugerByBurgerNameContaining(@Param("name") String name);

    List<Buger> findTop3ByOrderByBurgerCreateAtDesc();
}
