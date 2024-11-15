package com.example.hw5;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @Operation
    @GetMapping("/loginForm")
    public String login(){
        return "loginForm";
    }
}
