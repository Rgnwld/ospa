package com.ospa.applog.service;

import org.springframework.stereotype.Service;

import com.ospa.applog.entity.AppLog;
import com.ospa.applog.entity.AppLogAction;
import com.ospa.applog.repository.AppLogRepository;

import jakarta.transaction.Transactional;

@Service
public class AppLogService {
    
    AppLogRepository appLogRepository;

    public AppLogService(AppLogRepository appLogRepository) {
        this.appLogRepository = appLogRepository;
    }

    @Transactional
    public void logAction(String userId, AppLogAction actionCode, String actionDetails) {
        appLogRepository.save( new AppLog(userId, actionCode, actionDetails));
    }
}