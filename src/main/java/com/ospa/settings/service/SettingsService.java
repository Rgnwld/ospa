package com.ospa.settings.service;

import com.ospa.settings.dto.SettingsDTO;
import com.ospa.settings.entity.Settings;
import com.ospa.settings.mapper.SettingsMapper;
import com.ospa.settings.repository.SettingsRepository;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SettingsService {

    private final SettingsRepository settingsRepository;
    private final SettingsMapper settingsMapper;

    public SettingsService(SettingsRepository settingsRepository, SettingsMapper settingsMapper) {
        this.settingsRepository = settingsRepository;
        this.settingsMapper = settingsMapper;
    }

    @Transactional
    public SettingsDTO createSetting(SettingsDTO dto) {
        // Check if the setting key already exists
        if (settingsRepository.findBySettingKey(dto.getSettingKey()).isPresent()) {
            throw new IllegalArgumentException("Setting key already exists");
        }

        // Map DTO to entity
        Settings savedSettings = new Settings();
        savedSettings.setSettingKey(dto.getSettingKey());
        savedSettings.setSettingValue(dto.getSettingValue());

        return settingsMapper.toDTO(savedSettings);
    }

    @Transactional(readOnly = true)
    public SettingsDTO getSettingValue(String settingKey) {
        Settings settings = settingsRepository.findBySettingKey(settingKey)
                .orElseThrow(() -> new IllegalArgumentException("Setting key does not exist: " + settingKey));

        return settingsMapper.toDTO(settings);
    }

    @Transactional
    public List<SettingsDTO> getSettingsList() {
        
        List<Settings> savedSettings = settingsRepository.findAll();

        return settingsMapper.toDTO(savedSettings);
    }
}