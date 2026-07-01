package com.ospa.auth.dto;

import java.util.HashSet;
import java.util.Set;

import com.ospa.auth.entity.SecPermission;

public class SecPerfilDTO {

    private Long id;
    private String nome;
    private Set<SecPermission> permissoes = new HashSet<>();

    public SecPerfilDTO() {}

    public SecPerfilDTO(Long id, String nome, Set<SecPermission> permissoes) {
        this.id = id;
        this.nome = nome;
        this.permissoes = permissoes;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Set<SecPermission> getPermissoes() { return permissoes; }
    public void setPermissoes(Set<SecPermission> permissoes) { this.permissoes = permissoes;}

}