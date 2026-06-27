package com.ospa.auth.mapper;

import com.ospa.auth.entity.SecPerfil;
import com.ospa.auth.entity.SecPermission;
import com.ospa.auth.dto.SecPerfilDTO;

import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class SecPerfilMapper {

    public SecPerfilDTO toDTO(SecPerfil entity) {
        if (entity == null) return null;

        Set<String> permissoesNomes = entity.getPermissoes() == null
                ? Set.of()
                : entity.getPermissoes().stream().map(SecPermission::getNome).collect(Collectors.toSet());

        return new SecPerfilDTO(entity.getId(), entity.getNome(), permissoesNomes);
    }
}