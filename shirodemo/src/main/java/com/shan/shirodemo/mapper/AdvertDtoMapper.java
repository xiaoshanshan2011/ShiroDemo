package com.shan.shirodemo.mapper;

import com.shan.shirodemo.dto.AdvertDto;
import java.util.List;

public interface AdvertDtoMapper {
    int deleteByPrimaryKey(String userid);

    int insert(AdvertDto record);

    AdvertDto selectByPrimaryKey(String userid);

    List<AdvertDto> selectAll();

    int updateByPrimaryKey(AdvertDto record);
}