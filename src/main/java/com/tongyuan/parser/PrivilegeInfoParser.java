package com.tongyuan.parser;


import com.tongyuan.aop.PrivilegeInfo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangcy on 2018/3/22
 */
public class PrivilegeInfoParser {
    public static List<String> parse(Class<?> clz, String methodName) throws Exception{
        Method method = clz.getMethod(methodName);
        List<String> infos = new ArrayList<String>();
        if(method.isAnnotationPresent(PrivilegeInfo.class)){
            PrivilegeInfo info = method.getAnnotation(PrivilegeInfo.class);
            infos.addAll(Arrays.asList(info.value().split(";")));
        }
        return infos;
    }
}
