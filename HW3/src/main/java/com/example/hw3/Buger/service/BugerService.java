package com.example.hw3.Buger.service;

import com.example.hw3.Buger.dto.BugerDto;
import com.example.hw3.Buger.entity.Buger;
import com.example.hw3.Buger.repository.BugerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BugerService {

    private final BugerRepository bugerRepository;

    public void save(BugerDto bugerDto){
        Buger buger = Buger.builder()
                .burgerName(bugerDto.getBurgerName())
                .burgerPrice(bugerDto.getBurgerPrice())
                .build();

        bugerRepository.save(buger);
    }

    public BugerDto findById(Long bugerId){
        Buger buger = bugerRepository.findById(bugerId).get();

        return BugerDto.builder()
                .burgerName(buger.getBurgerName())
                .burgerPrice(buger.getBurgerPrice())
                .build();
    }

    public List<BugerDto> findAll(){
        List<Buger> burgers = bugerRepository.findAll();
        List<BugerDto> bugerDtos = burgers.stream().map(buger ->
                BugerDto.builder()
                        .burgerName(buger.getBurgerName())
                        .burgerPrice(buger.getBurgerPrice())
                        .build()).toList();
        return bugerDtos;
    }

    public void update(Long bugerId, BugerDto bugerDto){
        Buger buger = bugerRepository.findById(bugerId).get();
        buger.update(bugerDto.getBurgerName(), bugerDto.getBurgerPrice());
        bugerRepository.save(buger);
    }

    public void delete(Long bugerId){
        bugerRepository.deleteById(bugerId);
    }

    public List<BugerDto> getBugerNameByPrice(Long price) {
        List<Buger> burgers = bugerRepository.findBurgerByBurgerPriceGreaterThan(price);
        return burgers.stream()
                .map(buger -> BugerDto.builder()
                        .burgerName(buger.getBurgerName())
                        .burgerPrice(buger.getBurgerPrice())
                        .build())
                .toList();
    }

    public List<BugerDto> getBugersByName(String namePart) {
        List<Buger> burgers = bugerRepository.findBugerByBurgerNameContaining(namePart);
        return burgers.stream()
                .map(buger -> BugerDto.builder()
                        .burgerName(buger.getBurgerName())
                        .burgerPrice(buger.getBurgerPrice())
                        .build())
                .toList();
    }

    public List<BugerDto> getRecentBurgers() {
        List<Buger> burgers = bugerRepository.findTop3ByOrderByBurgerCreateAtDesc();
        return burgers.stream()
                .map(buger -> BugerDto.builder()
                        .burgerName(buger.getBurgerName())
                        .burgerPrice(buger.getBurgerPrice())
                        .build())
                .toList();
    }
}

