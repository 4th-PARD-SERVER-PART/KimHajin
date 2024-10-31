package com.example.hw5;

import com.example.hw5.user.entity.User;
import com.example.hw5.user.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class PrincipalOauth2UserService extends DefaultOAuth2UserService {
    private final UserRepo userRepo;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest oAuth2UserRequest) throws OAuth2AuthenticationException {
        log.info("Google에서 받아온 UserRequest: " + oAuth2UserRequest);
        OAuth2User oAuth2User = super.loadUser(oAuth2UserRequest);
        log.info("OAuth에서 받아온 정보: " + oAuth2User.getAttributes());

        saveUser(oAuth2User);

        return oAuth2User;
    }

    private void saveUser(OAuth2User oAuth2User) {
        //가져온 정보 Map형식으로 만들기
        Map<String, Object> attributes = oAuth2User.getAttributes();
        String username = (String) attributes.get("name");
        String email = (String) attributes.get("email");

        Optional<User> existingUser = userRepo.findByEmail(email);

        if (existingUser.isEmpty()) {
            User user = new User(null, username, email, null);
            userRepo.save(user);
            log.info("사용자 저장됨: " + user);
        } else {
            log.info("이미 존재하는 사용자: " + existingUser.get());
        }
    }
}
