package com.main.webserver.repository;

import com.main.webserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);  // 사용자 이름으로 검색하는 메서드 추가
}

