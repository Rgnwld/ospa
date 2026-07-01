package com.ospa.settings.mapper;

import com.ospa.settings.dto.SettingsDTO;
import com.ospa.settings.entity.Settings;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SettingsMapper {
    public SettingsDTO toDTO(Settings entity);

    public Settings toEntity(SettingsDTO dto);

    public List<SettingsDTO> toDTO(List<Settings> entities);
}