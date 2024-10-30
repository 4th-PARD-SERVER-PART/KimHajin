package com.example.seminar5.confing;

import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//환경설정 코드 - 확인,인증을 위한 환경설정을 함.
//client 가 보내면 반환을 해줘야함.
@Configuration //어노테이션 추가
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public  void configureViewResolvers(
            ViewResolverRegistry registry
    ){
        MustacheViewResolver resolver = new MustacheViewResolver();
        resolver.setCharset("UTF-8");
        resolver.setContentType("text/html;charset=UTF-8");
        resolver.setPrefix("classpath:/templates/"); //여기서 view 찾을게~
        resolver.setSuffix(".html");
        registry.viewResolver(resolver);
    }
}
