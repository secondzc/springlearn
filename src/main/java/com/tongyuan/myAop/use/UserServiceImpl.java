package com.tongyuan.myAop.use;

/**
 * Created by zhangcy on 2018/3/26
 */
public class UserServiceImpl implements UserService {
    @Override
    public String hello(String name) {
        return name;
    }
}
