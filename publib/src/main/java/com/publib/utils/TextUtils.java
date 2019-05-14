package com.publib.utils;

public class TextUtils {
    public static boolean isEmpty(String text){
        if (text == null || text.length()==0)
            return true;
        else
            return false;
    }
}
