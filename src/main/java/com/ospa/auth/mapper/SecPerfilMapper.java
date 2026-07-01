package com.ospa.auth.mapper;

import com.ospa.auth.entity.SecPerfil;
import com.ospa.auth.dto.SecPerfilDTO;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SecPerfilMapper {

    public SecPerfilDTO toDTO(SecPerfil entity);
    
    public SecPerfil toEntity(SecPerfilDTO dto);
}