package com.example.seminar5.confing;

import com.example.seminar5.PrincipalOauth2UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private final PrincipalOauth2UserService principalOauth2UserService;
    private final CorsConfig corsConfig;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf(AbstractHttpConfigurer::disable); //도메인끼리 상호작용 보호 기능 해제. 소통하겠다!
        http.addFilter(corsConfig.corsFilter());
        http.authorizeHttpRequests(au -> au.anyRequest().permitAll());
        http.oauth2Login(
                oauth -> oauth
                        .loginPage("/longinForm") // 로그인 페이지다. 프론트랑 맞춰줘야함.
                        .defaultSuccessUrl("/home") //로그인 성공하면 여기로 가셈
                        .userInfoEndpoint(
                                userInfo -> userInfo.userService(principalOauth2UserService)
                        ) //유저 정보를 principal에서 요청한 정보들을 가져온다.
        );
        return http.build();
    }
}
