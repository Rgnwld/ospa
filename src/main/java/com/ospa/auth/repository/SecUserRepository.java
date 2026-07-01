package com.ospa.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ospa.auth.entity.SecUser;

public interface SecUserRepository extends JpaRepository<SecUser, Long> {

    Optional<SecUser> findByEmail(String email);

    boolean existsByEmail(String email);

    @Query("select u FROM SecUser u LEFT JOIN FETCH u.perfis WHERE u.id = :id")
    Optional<SecUser> findByIdWithPerfis(@Param("id") Long id);

    @Query("SELECT u FROM SecUser u WHERE u.email = :email AND u.senha = :senha")
    Optional<SecUser> login(@Param("email") String email, @Param("senha") String password);
}