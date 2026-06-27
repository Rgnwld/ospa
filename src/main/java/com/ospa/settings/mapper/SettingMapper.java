package com.ospa.settings.mapper;

import com.ospa.settings.dto.SettingsDTO;
import com.ospa.settings.entity.Settings;

import org.springframework.stereotype.Component;

@Component
public class SettingMapper {

    public SettingsDTO toDTO(Settings entity) {

        if (entity == null)
            return null;

        return new SettingsDTO(
                entity.getId(),
                entity.getSettingKey(),
                entity.getSettingValue(),
                entity.getCriadoEm(),
                entity.getAtualizadoEm()
            );

    }
}