package com.publib.utils;

import java.util.UUID;

/**
 * @Author: chenjunshan
 * @Date: 18-12-29 下午4:03
 */
public class UUIDUtils {
    public static String getNewUid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
