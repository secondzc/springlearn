package com.tongyuan.service;

import com.tongyuan.aop.PrivilegeInfo;

/**
 * Created by zhangcy on 2018/3/22
 */
public class UserService {
    @PrivilegeInfo("insert;admin")
    public void insert(){
        System.out.println("insert");
    }

    @PrivilegeInfo("update")
    public void update(){
        System.out.println("update");
    }

    public void delete(){
        System.out.println("delete");
    }
}
