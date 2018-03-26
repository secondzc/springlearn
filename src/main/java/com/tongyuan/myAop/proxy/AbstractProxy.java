package com.tongyuan.myAop.proxy;

/**
 * Created by zhangcy on 2018/3/26
 */
public abstract class AbstractProxy implements  Proxy{
    @Override
    public Object doProxy(ProxyChain proxyChain) throws Throwable {
        //模板方法模式
        before();
        Object result = proxyChain.doProxyChain();
        after();
        return result;
    }

    public abstract Object before();
    public abstract Object after();
}
