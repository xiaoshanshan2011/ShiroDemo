package com.shan.shirodemo.mapper;

import com.shan.shirodemo.dto.EnomaticDto;
import java.util.List;

public interface EnomaticDtoMapper {
    int deleteByPrimaryKey(String id);

    int insert(EnomaticDto record);

    EnomaticDto selectByPrimaryKey(String id);

    List<EnomaticDto> selectAll();

    int updateByPrimaryKey(EnomaticDto record);
}