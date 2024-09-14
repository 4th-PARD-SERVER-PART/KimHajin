package com.server.pard.week3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//특정 데이터를 반환
public class HelloRestController {

    @RequestMapping("/helloRest")
    public String hello(){
        return "hello.html";
    }


}
