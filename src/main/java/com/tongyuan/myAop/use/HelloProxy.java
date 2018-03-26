package com.tongyuan.myAop.use;

import com.tongyuan.myAop.proxy.AbstractProxy;

/**
 * Created by zhangcy on 2018/3/26
 */
public class HelloProxy extends AbstractProxy{
    @Override
    public Object before() {
        System.out.println("hello say before");
        return null;
    }

    @Override
    public Object after() {
        System.out.println("hello say after");
        return null;
    }
}
