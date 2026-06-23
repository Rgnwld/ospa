package com.ospa.repository.sec;

import com.ospa.entity.sec.SecUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SecUserRepository extends JpaRepository<SecUser, Long> {

    Optional<SecUser> findByEmail(String email);

    boolean existsByEmail(String email);

    @Query("SELECT u FROM SecUser u LEFT JOIN FETCH u.perfis WHERE u.id = :id")
    Optional<SecUser> findByIdWithPerfis(@Param("id") Long id);
}