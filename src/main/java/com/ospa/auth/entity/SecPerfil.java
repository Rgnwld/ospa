package com.ospa.auth.entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sec_perfil")
public class SecPerfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @ManyToMany(mappedBy = "perfis", fetch = FetchType.LAZY)
    private Set<SecUser> usuarios = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "sec_perfil_permission",
        joinColumns = @JoinColumn(name = "perfil_id"),
        inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private Set<SecPermission> permissoes = new HashSet<>();

    public SecPerfil() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Set<SecUser> getUsuarios() { return usuarios; }
    public void setUsuarios(Set<SecUser> usuarios) { this.usuarios = usuarios; }

    public Set<SecPermission> getPermissoes() { return permissoes; }
    public void setPermissoes(Set<SecPermission> permissoes) { this.permissoes = permissoes; }
}