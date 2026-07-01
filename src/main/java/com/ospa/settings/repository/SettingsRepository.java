package com.ospa.settings.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ospa.settings.entity.Settings;

public interface SettingsRepository extends JpaRepository<Settings, Long> {
    @Query("SELECT s FROM Settings s WHERE s.settingKey = :settingKey")
    Optional<Settings> findBySettingKey(@Param("settingKey") String settingKey);
}