package com.tongyuan.myAop.use;

import com.tongyuan.myAop.proxy.AbstractProxy;

/**
 * Created by zhangcy on 2018/3/26
 */
public class EatProxy extends AbstractProxy {
    @Override
    public Object before() {
        System.out.println("before eat");
        return null;
    }

    @Override
    public Object after() {
        System.out.println("after eat");
        return null;
    }
}
