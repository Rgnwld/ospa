package com.ospa.repository.sec;

import com.ospa.entity.sec.SecLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecLogRepository extends JpaRepository<SecLog, Long> {

    List<SecLog> findByUserIdOrderByTimestampDesc(Long userId);
}