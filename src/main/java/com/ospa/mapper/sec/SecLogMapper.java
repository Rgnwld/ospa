
package com.ospa.mapper.sec;
import com.ospa.dto.sec.SecLogDTO;
import com.ospa.entity.sec.SecLog;

import org.springframework.stereotype.Component;

@Component
public class SecLogMapper {

    public SecLogDTO toDTO(SecLog entity) {
        if (entity == null) {
            return null;
        }

        SecLogDTO dto = new SecLogDTO();
        dto.setId(entity.getId());
        dto.setUsuarioNome(entity.getUser() != null ? entity.getUser().getNome() : null);
        dto.setAction(entity.getAction());
        dto.setTimestamp(entity.getTimestamp());

        return dto;
    }
}
