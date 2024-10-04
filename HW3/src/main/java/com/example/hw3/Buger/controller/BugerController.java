package com.example.hw3.Buger.controller;

import com.example.hw3.Buger.dto.BugerDto;
import com.example.hw3.Buger.entity.Buger;
import com.example.hw3.Buger.service.BugerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/burger")
public class BugerController {
    private final BugerService bugerService;

    //버거 메뉴 추가
    @PostMapping("")
    public String save(@RequestBody BugerDto bugerDto){
        bugerService.save(bugerDto);
        return "메뉴를 등록하였습니다.";
    }

    //하나의 버거 조회
    @GetMapping("/{burgerId}")
    public BugerDto findById(@PathVariable Long burgerId){
        return bugerService.findById(burgerId);
    }

    //전체 버거 메뉴 조회
    @GetMapping("")
    public List<BugerDto> findAll(){
        return bugerService.findAll();
    }

    //하나의 버거 내용 수정
    @PatchMapping("/{burgerId}")
    public String update(@PathVariable Long burgerId , @RequestBody BugerDto bugerDto){
        bugerService.update(burgerId, bugerDto);
        return  "해당 메뉴의 정보가 수정되었습니다.";
    }

    //하나의 버거 내용 삭제
    @DeleteMapping("/{burgerId}")
    public String delete(@PathVariable Long burgerId){
        bugerService.delete(burgerId);
        return "해당 메뉴가 삭제되었습니다.";
    }

    //버거 가격보다 낮은 가격을 가진 버거의 이름 가져오기
    @GetMapping("/burgerPrice")
    public List<BugerDto> getBugersByPrice(@RequestParam Long price){
        List<BugerDto> bugerDtos = bugerService.getBugerNameByPrice(price);
        return bugerDtos;
    }

    //버거 이름에 특정 문자열이 포함된 모든 버거를 조회하는 API
    @GetMapping("/burgerByName")
    public List<BugerDto> getBurgersByName(@RequestParam String name) {
        List<BugerDto> bugerDtos = bugerService.getBugersByName(name);
        return bugerDtos;
    }

    //최신에 나온 순서대로 3개 리스트
    @GetMapping("/recentBurger")
    public List<BugerDto> getRecentBurgers() {
        List<BugerDto> bugerDtos = bugerService.getRecentBurgers();
        return bugerDtos;
    }
}
