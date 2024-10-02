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
                .bugerName(bugerDto.getBugerName())
                .bugerPrice(bugerDto.getBugerPrice())
                .build();

        bugerRepository.save(buger);
    }

    public BugerDto findById(Long bugerId){
        Buger buger = bugerRepository.findById(bugerId).get();

        return BugerDto.builder()
                .bugerName(buger.getBugerName())
                .bugerPrice(buger.getBugerPrice())
                .build();
    }

    public List<BugerDto> findAll(){
        List<Buger> bugers = bugerRepository.findAll();
        List<BugerDto> bugerDtos = bugers.stream().map(buger ->
                BugerDto.builder()
                        .bugerName(buger.getBugerName())
                        .bugerPrice(buger.getBugerPrice())
                        .build()).toList();
        return bugerDtos;
    }

    public void update(Long bugerId, BugerDto bugerDto){
        Buger buger = bugerRepository.findById(bugerId).get();
        buger.update(bugerDto.getBugerName(), bugerDto.getBugerPrice());
        bugerRepository.save(buger);
    }

    public void delete(Long bugerId){
        bugerRepository.deleteById(bugerId);
    }
}

