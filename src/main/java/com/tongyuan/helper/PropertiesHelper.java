package com.tongyuan.helper;

import com.tongyuan.util.PropertiesUtil;

/**
 * Created by zhangcy on 2018/3/13
 */
public class PropertiesHelper {
    public static String getRpcName(){
        return PropertiesUtil.getString("rpc.name","77");
    }
}
