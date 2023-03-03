package com.sparta.myselectshop2.repository;

import com.sparta.myselectshop2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByKakaoId(Long id);
    // 기존에 카카오 아이디가 있는지 없는지 조회
    Optional<User> findByEmail(String email);
    // 이메일 중복 조회
}
