package com.ospa.auth.dto;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class SecUserDTO {

    private Long id;
    private String usrLogin;
    private String email;
    private Boolean ativo;
    private LocalDateTime criadoEm;
    private Set<SecPerfilDTO> perfis = new HashSet<>();

    public SecUserDTO() {}

    public SecUserDTO(Long id, String usrLogin, String email, Boolean ativo,
                       LocalDateTime criadoEm, Set<SecPerfilDTO> perfis) {
        this.id = id;
        this.usrLogin = usrLogin;
        this.email = email;
        this.ativo = ativo;
        this.criadoEm = criadoEm;
        this.perfis = perfis;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsrLogin() { return usrLogin; }
    public void setUsrLogin(String usrLogin) { this.usrLogin = usrLogin; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }

    public LocalDateTime getCriadoEm() { return criadoEm; }
    public void setCriadoEm(LocalDateTime criadoEm) { this.criadoEm = criadoEm; }

    public Set<SecPerfilDTO> getPerfis() { return perfis; }
    public void setPerfis(Set<SecPerfilDTO> perfis) { this.perfis = perfis; }
}