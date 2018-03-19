package com.tongyuan.testSpring;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;


import java.util.UUID;

/**
 * Created by zhangcy on 2018/3/15
 */
public class RoomFactoryBean implements FactoryBean,InitializingBean {



    @Override
    public Object getObject() throws Exception {
        System.out.println("执行了getObject");
        return UUID.randomUUID();
    }


    @Override
    public Class<?> getObjectType() {
        return UUID.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
