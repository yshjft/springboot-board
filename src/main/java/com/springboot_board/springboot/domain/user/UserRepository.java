package com.springboot_board.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // 위의 findBy에 이어 해당 Entity 필드 이름을 입력하면 검색 쿼리를 실행한 결과를 전달한다.
    // SQL의 where절을 메서드 이름을 통해 전달한다고 생각하면 된다.
    Optional<User> findByEmail(String Email);
}
