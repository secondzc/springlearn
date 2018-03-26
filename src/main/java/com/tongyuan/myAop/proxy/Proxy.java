package com.tongyuan.myAop.proxy;

/**
 * Created by zhangcy on 2018/3/26
 * 这个类的本质是一个：advice
 */
public interface Proxy {
    //为什么参数是ProxyChain呢？考虑Proxy和ProxyChain的关系，proxyChain中的一个proxy来的调用doProxy方法之后，还需要返回proxyChain
    //继续执行下一个proxy的方法，所以proxy必须持有proxyChain，同时proxyChain中记录有index信息，这也就是责任链模式
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
