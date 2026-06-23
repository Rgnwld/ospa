package com.ospa.repository.sec;

import com.ospa.entity.sec.SecPerfil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SecPerfilRepository extends JpaRepository<SecPerfil, Long> {

    Optional<SecPerfil> findByNome(String nome);
}