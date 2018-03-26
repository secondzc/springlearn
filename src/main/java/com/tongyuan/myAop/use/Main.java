package com.tongyuan.myAop.use;

import com.tongyuan.myAop.proxy.Proxy;
import com.tongyuan.myAop.proxy.ProxyManager;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zhangcy on 2018/3/26
 */
public class Main {
    public static void main(String[] args) throws Throwable{
        //模拟spring容器扫描切面类，建立增强和切点的关系，创建代理的bean
        Proxy[] proxies = new Proxy[]{new EatProxy(),new HelloProxy()};
        UserService userService = ProxyManager.getProxy(UserServiceImpl.class, Arrays.asList(proxies));

        System.out.println(userService.hello("zcyyy"));
    }
}
