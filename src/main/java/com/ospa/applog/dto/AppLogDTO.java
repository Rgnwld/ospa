package com.ospa.applog.dto;

import java.time.LocalDateTime;

import com.ospa.applog.entity.AppLogAction;

public class AppLogDTO {

    private Long id;
    private String userId;
    private AppLogAction actionCode;
    private String actionDetails;
    private LocalDateTime actionTimestamp;

    public AppLogDTO(Long id, String userId, AppLogAction actionCode, String actionDetails, LocalDateTime actionTimestamp) {
        this.id = id;
        this.userId = userId;
        this.actionCode = actionCode;
        this.actionDetails = actionDetails;
        this.actionTimestamp = actionTimestamp;
    }

    public Long getId() { return id; }

    public String getUserId() { return userId; }

    public AppLogAction getActionCode() { return actionCode; }
    public void setActionCode(AppLogAction actionCode) { this.actionCode = actionCode; }

    public String getActionDetails() { return actionDetails; } 
    public void setActionDetails(String actionDetails) { this.actionDetails = actionDetails; }
    
    public LocalDateTime getActionTimestamp() { return actionTimestamp; }
}