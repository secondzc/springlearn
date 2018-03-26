package com.tongyuan.myAop.annotation;

import java.lang.annotation.*;

/**
 * Created by zhangcy on 2018/3/26
 * 用在切面上，用来扫描
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAspect {
    Class<? extends Annotation> value();
}
