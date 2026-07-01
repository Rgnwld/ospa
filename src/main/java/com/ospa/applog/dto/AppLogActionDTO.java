package com.ospa.applog.dto;

public class AppLogActionDTO {

    private Long id;

    private String actionCode;

    private String actionDescription;

    // Construtores
    public AppLogActionDTO() {}

    public AppLogActionDTO(Long id, String actionCode, String actionDescription) {
        this.id = id;
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
}