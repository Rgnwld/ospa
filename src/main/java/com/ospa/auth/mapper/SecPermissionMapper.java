package com.ospa.auth.mapper;

import com.ospa.auth.entity.SecPermission;
import com.ospa.auth.dto.SecPermissionDTO;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SecPermissionMapper {
    SecPermissionDTO toDTO(SecPermission entity);
    SecPermission toEntity(SecPermissionDTO dto);
}