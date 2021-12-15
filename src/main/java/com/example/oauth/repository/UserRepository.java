package com.example.oauth.repository;

import com.example.oauth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고 있음.
// JpaRepository 를 상속하면 자동 컴포넌트 스캔됨.
public interface UserRepository extends JpaRepository<User, Integer> {
    //findBy규칙 -> Username 문법
    //select * form user where username = 1?
    //Jpa Query methods
    public User findByUsername(String username);
}
