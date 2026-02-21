package com.az.tehsilly.springsecurityl1.repository;

import com.az.tehsilly.springsecurityl1.entity.RefreshTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshTokenEntity, Long> {


}
