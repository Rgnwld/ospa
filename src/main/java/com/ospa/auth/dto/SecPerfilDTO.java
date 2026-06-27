package com.ospa.auth.dto;

import java.util.Set;

public class SecPerfilDTO {

    private Long id;
    private String nome;
    private Set<String> permissoes;

    public SecPerfilDTO() {}

    public SecPerfilDTO(Long id, String nome, Set<String> permissoes) {
        this.id = id;
        this.nome = nome;
        this.permissoes = permissoes;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Set<String> getPermissoes() { return permissoes; }
    public void setPermissoes(Set<String> permissoes) { this.permissoes = permissoes; }
}