package com.ospa.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ospa.auth.entity.SecPermission;

public interface SecPermissionRepository extends JpaRepository<SecPermission, Long> {}