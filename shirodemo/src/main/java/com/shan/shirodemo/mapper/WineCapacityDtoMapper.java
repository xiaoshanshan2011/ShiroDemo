package com.shan.shirodemo.mapper;

import com.shan.shirodemo.dto.WineCapacityDto;
import java.util.List;

public interface WineCapacityDtoMapper {
    int deleteByPrimaryKey(String capacityid);

    int insert(WineCapacityDto record);

    WineCapacityDto selectByPrimaryKey(String capacityid);

    List<WineCapacityDto> selectAll();

    int updateByPrimaryKey(WineCapacityDto record);
}