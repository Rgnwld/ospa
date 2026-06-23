package com.ospa.repository.sec;

import com.ospa.entity.sec.SecPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecPermissionRepository extends JpaRepository<SecPermission, Long> {
}