package com.tongyuan.aop;

import com.tongyuan.parser.PrivilegeInfoParser;
import com.tongyuan.testAop.PrivilegeManager;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhangcy on 2018/3/22
 */
@Aspect
public class PrivilegeAspect {
    @Autowired
    private PrivilegeManager privilegeManager;

    @Pointcut("execution(* com.tongyuan.service.*.*(..))")
    public void check(){

    }

    @Around("check()")
    public void doCheck(ProceedingJoinPoint joinPoint) throws Throwable {
        Class<?> clz = joinPoint.getTarget().getClass();
        String method = joinPoint.getSignature().getName();
        List<String> requiredInfos = PrivilegeInfoParser.parse(clz,method);
        List<String> infos = PrivilegeManager.getInfos();
        for(String info:requiredInfos){
            if(!infos.contains(info)){
                System.out.println("你至少有一项权限不满足");
                return ;
            }
        }
        joinPoint.proceed();
    }
}
