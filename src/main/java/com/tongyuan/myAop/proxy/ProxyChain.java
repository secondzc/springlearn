package com.tongyuan.myAop.proxy;

import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangcy on 2018/3/26
 */
public class ProxyChain {
    private Class<?> targetClass;
    private Object targetObject;
    private Object[] args;
    private MethodProxy methodProxy;
    private List<Proxy> proxyList = new ArrayList<Proxy>();
    private Method targetMethod;
    private int proxyIndex = 0;

    public ProxyChain(Class<?> targetClass, Object targetObject, Object[] args, MethodProxy methodProxy, List<Proxy> proxyList, Method targetMethod) {
        this.targetClass = targetClass;
        this.targetObject = targetObject;
        this.args = args;
        this.methodProxy = methodProxy;
        this.proxyList = proxyList;
        this.targetMethod = targetMethod;
    }

    public Class<?> getTargetClass() {
        return targetClass;
    }

    public Object getTargetObject() {
        return targetObject;
    }

    public Method getTargetMethod() {
        return targetMethod;
    }

    public Object doProxyChain() throws  Throwable{
        Object result;
        if(proxyIndex<proxyList.size()){
            result = proxyList.get(proxyIndex++).doProxy(this);
        }else{
            result = methodProxy.invokeSuper(targetObject,args);
        }
        return result;
    }
}
