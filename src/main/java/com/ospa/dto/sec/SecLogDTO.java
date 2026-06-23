package com.ospa.dto.sec;

import java.time.LocalDateTime;

public class SecLogDTO {

    private Long id;
    private String usuarioNome;
    private String action;
    private String actionDetails;
    private LocalDateTime timestamp;

    public SecLogDTO() {}

    public SecLogDTO(Long id, String usuarioNome, String action,
                      String actionDetails, LocalDateTime timestamp) {
        this.id = id;
        this.usuarioNome = usuarioNome;
        this.action = action;
        this.actionDetails = actionDetails;
        this.timestamp = timestamp;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsuarioNome() { return usuarioNome; }
    public void setUsuarioNome(String usuarioNome) { this.usuarioNome = usuarioNome; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public String getActionDetails() { return actionDetails; }
    public void setActionDetails(String actionDetails) { this.actionDetails = actionDetails; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}