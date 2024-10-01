package com.example.thirdseminar.User.service;

import com.example.thirdseminar.User.dto.UserDto;
import com.example.thirdseminar.User.entity.User;
import com.example.thirdseminar.User.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(UserDto userDto){
        User user = User.builder()
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();

        userRepository.save(user);
        //JPArepository에 이미 있는 function들이 있기 때문에 가져다가 쓰면 됨.
    }

    public UserDto read(Long userId){
        User user = userRepository.findById(userId).get();
        return UserDto.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    public List<UserDto> readAll(){
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = users.stream().map(user ->
                UserDto.builder()
                        .email(user.getEmail())
                        .password(user.getPassword())
                        .build()).toList();
        return userDtos;
    }

    //@Transactional
    public void update(Long userId, UserDto userDto){
        User user = userRepository.findById(userId).get();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        //왜 save 하는지? local과 DB값의 차이, local 값은 가져와 수정하면 바로 수정되지만 DB값은 저장을 해줘야함.
    }

    public void delete(Long userId){
        userRepository.deleteById(userId);
    }

    public Long getUserNum(String email){
        User user = userRepository.findByEmail(email);
        return user.getUserId();
    }


}
