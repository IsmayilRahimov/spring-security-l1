package com.az.tehsilly.springsecurityl1.repository;

import com.az.tehsilly.springsecurityl1.entity.AuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<AuthEntity, Long> {

    Optional<AuthEntity> findByUsername(String username);

    Optional<AuthEntity> findByEmail(String email);


    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
