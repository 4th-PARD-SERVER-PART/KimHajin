package com.example.pard4thshort.user.repo;

import com.example.pard4thshort.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User , Integer> {
}
