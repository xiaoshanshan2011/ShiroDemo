package com.shan.shirodemo.mapper;

import com.shan.shirodemo.dto.ProductDto;
import java.util.List;

public interface ProductDtoMapper {
    int deleteByPrimaryKey(String productid);

    int insert(ProductDto record);

    ProductDto selectByPrimaryKey(String productid);

    List<ProductDto> selectAll();

    int updateByPrimaryKey(ProductDto record);
}