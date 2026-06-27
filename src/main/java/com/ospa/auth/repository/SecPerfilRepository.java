package com.ospa.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ospa.auth.entity.SecPerfil;

import java.util.Optional;

public interface SecPerfilRepository extends JpaRepository<SecPerfil, Long> {

    Optional<SecPerfil> findByNome(String nome);
}