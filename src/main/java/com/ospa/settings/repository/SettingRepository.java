package com.ospa.settings.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ospa.auth.entity.SecUser;

public interface SettingRepository extends JpaRepository<SecUser, Long> {
    @Query("SELECT s FROM SecSettings s WHERE s.settingKey = :settingKey")
    Optional<SecUser> findBySettingKey(@Param("settingKey") String settingKey);
}