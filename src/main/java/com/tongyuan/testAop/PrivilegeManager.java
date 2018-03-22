package com.tongyuan.testAop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhangcy on 2018/3/22
 */
public class PrivilegeManager {
    //权限用；分隔
    private static final List<String> privilegeInfo = new ArrayList<String>();

    public PrivilegeManager(List<String> info) {
        privilegeInfo.addAll(info);
    }

    public static List<String> getInfos(){
        return privilegeInfo;
    }
}
