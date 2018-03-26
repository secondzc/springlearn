package com.tongyuan.myAop.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by zhangcy on 2018/3/26
 * 容器启动时初始化ProxyManager，运行时由切面类来调用ProxyManager
 * 在容器中使用ProxyManager创建bean并把它放入底层的额beanMap中，这样才能够通过IOC将被代理对象注入到其他对象中
 */
public class ProxyManager {
    public static <T> T getProxy(final Class<T> clz, final List<Proxy> proxyList) throws Throwable{
        return (T) Enhancer.create(clz, new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                ProxyChain proxyChain = new ProxyChain(clz,o,objects,methodProxy,proxyList,method);
                return proxyChain.doProxyChain();
            }
        });
    }
}
