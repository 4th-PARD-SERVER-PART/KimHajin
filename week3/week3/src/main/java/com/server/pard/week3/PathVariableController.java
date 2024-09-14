package com.server.pard.week3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {
    @RequestMapping("/path/{name}")
    public String pathV1(@PathVariable("name") String myName){
        return "1번 path variable controller name : " + myName ;
    }

    @RequestMapping("/pathV2/{name}")
    public String pathV2(@PathVariable String name){
        return  "2번 path variable controller name : " + name;
    }

    @RequestMapping("/pathV3/{name}/{age}")
    public String pathV3(@PathVariable String name, @PathVariable Long age){
        return "3번 user name : "+ name +" 나이 : "+age;
    }
}
