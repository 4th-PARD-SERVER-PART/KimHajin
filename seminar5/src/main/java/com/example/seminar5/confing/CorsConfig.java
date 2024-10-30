package com.example.seminar5.confing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

//프론트 도메인과 백엔드 도메인이 달라도 소통할 수 있도록 해줌. -> 원래는 보안때문에 못함.
//설정안하면 프론트랑 연결 X
@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); //axios를 쓸 수 있도록 허용함
        config.addAllowedOrigin("*"); //모든 IP에서 응답하겠다!다 뚫겠다 !
        config.addAllowedHeader("*");
        config.addAllowedMethod("*"); //모든 method 허용할게(delete는 안하기도 함.)
        source.registerCorsConfiguration("*",config);//패턴에 IP주소를 넣음
        return new CorsFilter(source);
    }
}
