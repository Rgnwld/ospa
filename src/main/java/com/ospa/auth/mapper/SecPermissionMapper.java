package com.ospa.auth.mapper;

import com.ospa.auth.entity.SecPermission;
import com.ospa.auth.dto.SecPermissionDTO;

import org.mapstruct.Mapper;

@Mapper
public interface SecPermissionMapper {
    SecPermissionDTO toDTO(SecPermission entity);
}

// @Mapper(componentModel = "spring")
// public class SecPermissionMapper {
//     public SecPermissionDTO toDTO(SecPermission entity) {
//         if (entity == null) {
//             return null;
//         }

//         SecPermissionDTO dto = new SecPermissionDTO();
//         dto.setId(entity.getId());
//         dto.setNome(entity.getNome());
//         dto.setDescricao(entity.getDescricao());

//         return dto;
//     }
// }