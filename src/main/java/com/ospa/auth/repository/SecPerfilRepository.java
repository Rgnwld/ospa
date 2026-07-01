package com.ospa.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ospa.auth.entity.SecPerfil;

public interface SecPerfilRepository extends JpaRepository<SecPerfil, Long> {

    SecPerfil findByNome(String nome);
}