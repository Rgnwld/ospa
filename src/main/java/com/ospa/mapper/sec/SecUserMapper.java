package com.ospa.mapper.sec;

import com.ospa.dto.sec.SecUserDTO;
import com.ospa.entity.sec.SecPerfil;
import com.ospa.entity.sec.SecUser;
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
                entity.getNome(),
                entity.getEmail(),
                entity.getAtivo(),
                entity.getCriadoEm(),
                perfisNomes
        );
    }
}