package com.ospa.settings.dto;

import java.time.LocalDateTime;

public class SettingsDTO {

    private Long id;
    private String settingKey;
    private String settingValue;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public SettingsDTO() {}

    public SettingsDTO(Long id, String settingKey, String settingValue, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.settingKey = settingKey;
        this.settingValue = settingValue;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSettingKey() { return settingKey; }
    public void setSettingKey(String settingKey) { this.settingKey = settingKey; }

    public String getSettingValue() { return settingValue; }
    public void setSettingValue(String settingValue) { this.settingValue = settingValue; }

    public LocalDateTime getCriadoEm() { return criadoEm; }
    public void setCriadoEm(LocalDateTime criadoEm) { this.criadoEm = criadoEm; }

    public LocalDateTime getAtualizadoEm() { return atualizadoEm; }
    public void setAtualizadoEm(LocalDateTime atualizadoEm) { this.atualizadoEm = atualizadoEm; }
}