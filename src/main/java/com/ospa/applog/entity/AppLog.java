package com.ospa.applog.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "app_log")
public class AppLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "action_code")
    private AppLogAction actionCode;

    @Column(name="action_details", nullable = false)
    private String actionDetails;

    @Column(name = "action_timestamp", nullable = false, updatable = false, insertable = false, 
        columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime actionTimestamp;


    // Construtores
    public AppLog() {}

    public AppLog(String userId, AppLogAction actionCode, String actionDetails) {
        this.userId = userId;
        this.actionCode = actionCode;
        this.actionDetails = actionDetails;
    }

    // Getters e Setters
    public Long getId() { return id;}
    public void setId(Long id) {this.id = id;}

    public String getUserId() {return userId;}
    public void setUserId(String userId) {this.userId = userId;}

    public AppLogAction getActionCode() {return actionCode;}
    public void setActionCode(AppLogAction actionCode) {this.actionCode = actionCode;}

    public String getActionDetails() {return actionDetails;}
    public void setActionDetails(String actionDetails) {this.actionDetails = actionDetails;}

    public LocalDateTime getActionTimestamp() {return actionTimestamp;}
    public void setActionTimestamp(LocalDateTime actionTimestamp) {this.actionTimestamp = actionTimestamp;}
}