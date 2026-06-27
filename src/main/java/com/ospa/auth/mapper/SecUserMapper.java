package com.ospa.auth.mapper;

import com.ospa.auth.entity.SecPerfil;
import com.ospa.auth.entity.SecUser;
import com.ospa.auth.dto.SecUserDTO;

import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class SecUserMapper {

    public SecUserDTO toDTO(SecUser entity) {
        if (entity == null) return null;

        Set<String> perfisNomes = entity.getPerfis() == null
                ? Set.of()
                : entity.getPerfis().stream().map(SecPerfil::getNome).collect(Collectors.toSet());

        return new SecUserDTO(
                entity.getId(),
                entity.getUsrLogin(),
                entity.getEmail(),
                entity.getAtivo(),
                entity.getCriadoEm(),
                perfisNomes
        );
    }
}