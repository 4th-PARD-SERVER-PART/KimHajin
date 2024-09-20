package com.server.pard.HW1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list")
public class ChecklistRestController {

    @GetMapping("")
    public String getList(){
        return "체크 리스트를 조회합니다.";
    }

}
