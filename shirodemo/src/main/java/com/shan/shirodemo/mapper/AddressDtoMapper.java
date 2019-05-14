package com.shan.shirodemo.mapper;

import com.shan.shirodemo.dto.AddressDto;
import java.util.List;

public interface AddressDtoMapper {
    int deleteByPrimaryKey(String id);

    int insert(AddressDto record);

    AddressDto selectByPrimaryKey(String id);

    List<AddressDto> selectAll();

    int updateByPrimaryKey(AddressDto record);
}