package com.ospa.auth.mapper;

import com.ospa.auth.entity.SecUser;

import com.ospa.auth.dto.SecUserDTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SecUserMapper {

    @Mapping(source = "perfis", target = "perfis")
    public SecUserDTO toDTO(SecUser entity);

    @Mapping(source = "perfis", target = "perfis")
    @Mapping(target = "senha", ignore = true)
    @Mapping(target = "atualizadoEm", ignore = true)
    @Mapping(target = "senhaResetToken", ignore = true)
    @Mapping(target = "authorities", ignore = true)
    public SecUser toEntity(SecUserDTO dto);
}