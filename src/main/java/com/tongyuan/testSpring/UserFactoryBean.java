package com.tongyuan.testSpring;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.FactoryBean;


/**
 * Created by zhangcy on 2018/3/17
 */
public class UserFactoryBean implements FactoryBean<UserBean> {

    @Override
    public UserBean getObject() throws Exception {
        UserBean userBean = new UserBean();
        userBean.setUsername("zzzzc");
        return userBean;
    }


    @Override
    public Class<?> getObjectType() {
        return UserBean.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
