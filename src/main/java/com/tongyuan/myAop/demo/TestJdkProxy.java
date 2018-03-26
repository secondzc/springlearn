package com.tongyuan.myAop.demo;

import com.tongyuan.myAop.use.UserService;
import com.tongyuan.myAop.use.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhangcy on 2018/3/26
 */
public class TestJdkProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(targetObject,args);
        System.out.println("after");
        return result;
    }


    private Object targetObject;

    public TestJdkProxy(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                this);
    }

    public static void main(String[] args) {
        TestJdkProxy testJdkProxy = new TestJdkProxy(new UserServiceImpl());
        UserService userService = (UserService) testJdkProxy.getProxy();
        System.out.println(userService.hello("zzz"));
    }
}
