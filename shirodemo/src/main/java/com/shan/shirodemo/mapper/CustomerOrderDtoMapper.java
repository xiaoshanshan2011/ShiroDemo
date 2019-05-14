package com.shan.shirodemo.mapper;

import com.shan.shirodemo.dto.CustomerOrderDto;
import java.util.List;

public interface CustomerOrderDtoMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(CustomerOrderDto record);

    CustomerOrderDto selectByPrimaryKey(String orderid);

    List<CustomerOrderDto> selectAll();

    int updateByPrimaryKey(CustomerOrderDto record);
}