package com.ospa.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ospa.auth.entity.SecLog;

import java.util.List;

public interface SecLogRepository extends JpaRepository<SecLog, Long> {

    List<SecLog> findByUserIdOrderByTimestampDesc(Long userId);
}