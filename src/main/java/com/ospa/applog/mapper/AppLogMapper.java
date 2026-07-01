package com.ospa.applog.mapper;

import org.mapstruct.Mapper;

import com.ospa.applog.dto.AppLogDTO;
import com.ospa.applog.entity.AppLog;

@Mapper(componentModel = "spring")
public interface AppLogMapper {

    public AppLogDTO toDTO(AppLog entity);
    public AppLog toEntity(AppLogDTO dto);
}