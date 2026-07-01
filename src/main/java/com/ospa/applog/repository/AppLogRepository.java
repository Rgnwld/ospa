package com.ospa.applog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ospa.applog.entity.AppLog;

public interface AppLogRepository extends JpaRepository<AppLog, Long> {
    @Query("SELECT a FROM AppLog a WHERE a.userId = :userId")
    Optional<AppLog> findByUserId(@Param("userId") String userId);
}