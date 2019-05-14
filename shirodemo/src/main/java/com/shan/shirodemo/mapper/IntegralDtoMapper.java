package com.shan.shirodemo.mapper;

import com.shan.shirodemo.dto.IntegralDto;
import java.util.List;

public interface IntegralDtoMapper {
    int deleteByPrimaryKey(String id);

    int insert(IntegralDto record);

    IntegralDto selectByPrimaryKey(String id);

    List<IntegralDto> selectAll();

    int updateByPrimaryKey(IntegralDto record);
}