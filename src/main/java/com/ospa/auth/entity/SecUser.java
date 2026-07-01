package com.ospa.auth.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "sec_user")
public class SecUser implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String usrLogin;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 255)
    private String senha;

    @Column(name = "criado_em", nullable = false, updatable = false, insertable = false, 
        columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime criadoEm;

    @Column(name = "atualizado_em", nullable = false, 
        columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime atualizadoEm;

    @Column(name = "senha_reset_token", length = 255)
    private String senhaResetToken;

    @Column(nullable = false)
    private Boolean ativo = true;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "sec_user_perfil",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "perfil_id")
    )
    private Set<SecPerfil> perfis = new HashSet<>();

    // Construtores
    public SecUser() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsrLogin() { return usrLogin; }
    public void setUsrLogin(String usrLogin) { this.usrLogin = usrLogin; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public LocalDateTime getCriadoEm() { return criadoEm; }
    public void setCriadoEm(LocalDateTime criadoEm) { this.criadoEm = criadoEm; }

    public LocalDateTime getAtualizadoEm() { return atualizadoEm; }
    public void setAtualizadoEm(LocalDateTime atualizadoEm) { this.atualizadoEm = atualizadoEm; }

    public String getSenhaResetToken() { return senhaResetToken; }
    public void setSenhaResetToken(String senhaResetToken) { this.senhaResetToken = senhaResetToken; }

    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }

    public Set<SecPerfil> getPerfis() { return perfis; }
    public void setPerfis(Set<SecPerfil> perfis) { this.perfis = perfis; }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }

    @Override
    public String getPassword() { return this.senha; }

    @Override
    public String getUsername() {   return this.usrLogin; }
}