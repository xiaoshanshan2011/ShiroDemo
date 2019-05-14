package com.shan.shirodemo.mapper;

import com.shan.shirodemo.dto.SysUserDto;
import java.util.List;

public interface SysUserDtoMapper {
    int deleteByPrimaryKey(String sysuserid);

    int insert(SysUserDto record);

    SysUserDto selectByPrimaryKey(String sysuserid);

    List<SysUserDto> selectAll();

    int updateByPrimaryKey(SysUserDto record);
}