package com.tongyuan.myAop.demo;

import com.tongyuan.myAop.use.UserService;
import com.tongyuan.myAop.use.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhangcy on 2018/3/26
 */
public class TestCGLIB implements MethodInterceptor{
    //单例模式
    private TestCGLIB(){}
    private static TestCGLIB singleton = new TestCGLIB();
    public  static TestCGLIB singleton(){
        return singleton;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("after");
        return result;
    }

    //可以避免使用时强制转换
    public  <T> T getProxy(Class<T> clz){
        return (T)Enhancer.create(clz,this);
    }

    public static void main(String[] args) {
        //cglib同样可以代理类而不是接口
        UserService userService = TestCGLIB.singleton().getProxy(UserServiceImpl.class);
        System.out.println(userService.hello("zzzz"));
    }
}
