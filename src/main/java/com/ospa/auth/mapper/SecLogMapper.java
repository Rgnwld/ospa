
package com.ospa.auth.mapper;
import com.ospa.auth.entity.SecLog;
import com.ospa.auth.dto.SecLogDTO;

import org.springframework.stereotype.Component;

@Component
public class SecLogMapper {

    public SecLogDTO toDTO(SecLog entity) {
        if (entity == null) {
            return null;
        }

        SecLogDTO dto = new SecLogDTO();
        dto.setId(entity.getId());
        dto.setUsuarioNome(entity.getUser() != null ? entity.getUser().getUsrLogin() : null);
        dto.setAction(entity.getAction());
        dto.setTimestamp(entity.getTimestamp());

        return dto;
    }
}
