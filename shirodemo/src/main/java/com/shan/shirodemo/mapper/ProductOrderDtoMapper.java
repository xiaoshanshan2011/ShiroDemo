package com.shan.shirodemo.mapper;

import com.shan.shirodemo.dto.ProductOrderDto;
import java.util.List;

public interface ProductOrderDtoMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(ProductOrderDto record);

    ProductOrderDto selectByPrimaryKey(String orderid);

    List<ProductOrderDto> selectAll();

    int updateByPrimaryKey(ProductOrderDto record);
}