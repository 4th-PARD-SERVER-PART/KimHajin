package com.example.hw3.Buger.controller;

import com.example.hw3.Buger.dto.BugerDto;
import com.example.hw3.Buger.service.BugerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buger")
public class BugerController {
    private final BugerService bugerService;

    //버거 메뉴 추가
    @PostMapping("")
    public String save(@RequestBody BugerDto bugerDto){
        bugerService.save(bugerDto);
        return "메뉴를 등록하였습니다.";
    }

    //하나의 버거 조회
    @GetMapping("/{bugerId}")
    public BugerDto findById(@PathVariable Long bugerId){
        return bugerService.findById(bugerId);
    }

    //전체 버거 메뉴 조회
    @GetMapping("")
    public List<BugerDto> findAll(){
        return bugerService.findAll();
    }

    //하나의 버거 내용 수정
    @PatchMapping("/{bugerId}")
    public String update(@PathVariable Long bugerId , @RequestBody BugerDto bugerDto){
        bugerService.update(bugerId, bugerDto);
        return  "해당 메뉴의 정보가 수정되었습니다.";
    }

    //하나의 버거 내용 삭제
    @DeleteMapping("/{bugerId}")
    public String delete(@PathVariable Long bugerId){
        bugerService.delete(bugerId);
        return "해당 메뉴가 삭제되었습니다.";
    }
}
