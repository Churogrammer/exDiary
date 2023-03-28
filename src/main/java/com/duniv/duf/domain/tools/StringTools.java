package com.duniv.duf.domain.tools;

public class StringTools {

    public static boolean isEmpty(String str){
        return (str == null || str.length() == 0) ? true : false;
    }
}
