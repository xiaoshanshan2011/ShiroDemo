package com.shan.shirodemo.mapper;

import com.shan.shirodemo.dto.MessageDto;
import java.util.List;

public interface MessageDtoMapper {
    int deleteByPrimaryKey(String id);

    int insert(MessageDto record);

    MessageDto selectByPrimaryKey(String id);

    List<MessageDto> selectAll();

    int updateByPrimaryKey(MessageDto record);
}