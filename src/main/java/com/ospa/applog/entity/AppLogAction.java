package com.ospa.applog.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "app_log_action")
public class AppLogAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "action_code", nullable = false, length = 255, unique = true)
    private String actionCode;

    @Column(name = "action_description", nullable = false)
    private String actionDescription;

    @Column(name = "action_timestamp", nullable = false, updatable = false, insertable = false, 
        columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime actionTimestamp;

    // Construtores
    public AppLogAction() {}

    public AppLogAction(String actionCode, String actionDescription) {
        this.actionCode = actionCode;
        this.actionDescription = actionDescription;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getActionCode() { return actionCode; }
    public void setActionCode(String actionCode) { this.actionCode = actionCode; }

    public String getActionDescription() { return actionDescription; }
    public void setActionDescription(String actionDescription) { this.actionDescription = actionDescription; }

    public LocalDateTime getActionTimestamp() { return actionTimestamp; }
    public void setActionTimestamp(LocalDateTime actionTimestamp) { this.actionTimestamp = actionTimestamp; }
}