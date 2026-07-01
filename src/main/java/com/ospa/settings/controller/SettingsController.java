package com.ospa.settings.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ospa.settings.dto.SettingsDTO;
import com.ospa.settings.service.SettingsService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/settings")
public class SettingsController {

    private final SettingsService settingsService;

    public SettingsController(SettingsService settingsService) {
        this.settingsService = settingsService;
    }
    
    @GetMapping("/")
    public ResponseEntity<SettingsDTO> getSetting(@RequestParam String settingKey) {
        SettingsDTO resp = settingsService.getSettingValue(settingKey);
        return ResponseEntity.ok(resp);
    }

    @GetMapping("")
    public ResponseEntity<List<SettingsDTO>> getSettings() {
        List<SettingsDTO> resp = settingsService.getSettingsList();
        return ResponseEntity.ok(resp);
    }

    @PostMapping("")
    public ResponseEntity<SettingsDTO> createSetting(@RequestBody SettingsDTO dto) {
        SettingsDTO resp = settingsService.createSetting(dto);
        return ResponseEntity.ok(resp);
    }
}