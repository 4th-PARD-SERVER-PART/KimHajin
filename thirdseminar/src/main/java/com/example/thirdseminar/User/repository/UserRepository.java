package com.example.thirdseminar.User.repository;

import com.example.thirdseminar.User.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
    //user로 저장되고 데이터의 가장 작은 단위기 때문에 user로 받아올 수 밖에 없음.

}
