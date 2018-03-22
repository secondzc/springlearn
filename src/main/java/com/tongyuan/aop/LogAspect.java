package com.tongyuan.aop;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangcy on 2018/3/22
 */
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.tongyuan.aop.Calculator.add(..))")
    public void test(){

    }

    @Around("test()")
    public Object around(ProceedingJoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getName();
        String method = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("className = "+ className + " method = "+ method + " args = "+ args);

        Long start = System.currentTimeMillis();
        Object result = null;
        System.out.println("before around");
        try {
            result =joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Long end = System.currentTimeMillis();
        //System.out.println("cost time is = " + (end - start) + " ms");
        System.out.println("after around");
        return result;
    }

    @Before("test()")
    public void before(){
        System.out.println("before test");
    }

    @After("test()")
    public void after(){
        System.out.println("after test");
    }
}
