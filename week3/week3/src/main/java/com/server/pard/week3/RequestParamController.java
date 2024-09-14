package com.server.pard.week3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RequestParamController {

    @RequestMapping("/v1")
    public String param1(@RequestParam("name") String myName,
                         @RequestParam("age") int age){
        return "Request Param 1번 : " + myName + " 나이 : " + age;
    }

    @RequestMapping("/v2")
    public String param2(@RequestParam String name, @RequestParam int age){
        return "2번 request param : " + name + " 나이 : " + age;
    }

    //추천하지는 않음 정확하게 쓰는 것이 좋음
    @RequestMapping("/v3")
    public String param3(String name, int age){
        return "3번 request param : " + name + " 나이 : " + age;
    }

    @RequestMapping("/v4")
    public String param4(@RequestParam String name,
                         @RequestParam(required = false) Integer age){
        if(age==null){
            return "4번 request param : " + name + " 나이 : 입력값 없음";
        }
        return "4번 request param : " + name +  " 나이 : " + age;
    }

    @RequestMapping("/v5")
    public String param5(@RequestParam(required = true, defaultValue = "파드") String name,
                         @RequestParam(required = false, defaultValue = "-1") Integer age){
        return "Request param 5 : " + name + " age " + age;
    }

    @RequestMapping("/v6")
    public String param6(@RequestParam Map<String, Object> map){
        return "Request param 6 : " + map.get("name") + map.get("age");
    }
}
