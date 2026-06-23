package com.ospa.mapper.sec;

import com.ospa.dto.sec.SecPermissionDTO;
import com.ospa.entity.sec.SecPermission;
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