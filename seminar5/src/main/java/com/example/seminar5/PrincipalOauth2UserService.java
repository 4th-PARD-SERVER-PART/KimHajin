package com.example.seminar5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

//oauth통해서 하면 받은 유저 정보 print하는 코드
@Service
@Slf4j //로그에 프린트할 때 쓴다.
public class PrincipalOauth2UserService extends DefaultOAuth2UserService {
    @Override
    public OAuth2User loadUser(
            OAuth2UserRequest oAuth2UserRequest
    ) throws OAuth2AuthenticationException{
        log.info("google에서 받아온 UserRequest: " + oAuth2UserRequest);
        OAuth2User oAuth2User = super.loadUser(oAuth2UserRequest);
        log.info("oauth에서 받아온 정보 : " + oAuth2User.getAttributes());
        return super.loadUser(oAuth2UserRequest);
    }
}
