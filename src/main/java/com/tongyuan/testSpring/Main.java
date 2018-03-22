package com.tongyuan.testSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.UUID;

/**
 * Created by zhangcy on 2018/3/13
 */
public class Main {
    public static void main(String[] args) {
 //         ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//        UserBean userBean = (UserBean) ctx.getBean("userBean");
//        UUID roomFactoryBean1 = (UUID) ctx.getBean("roomFactoryBean1");
//        UUID roomFactoryBean2 = (UUID) ctx.getBean("roomFactoryBean2");
//        System.out.println(roomFactoryBean1);
//        System.out.println(roomFactoryBean2);
//        System.out.println(((UserBean)ctx.getBean("userFactoryBean")).getUsername());
//        System.out.println(ctx.getBean("&userFactoryBean"));

//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//        UserBean userBean = (UserBean) ctx.getBean("testbean");
//        System.out.println(userBean.getUsername() + "," + userBean.getEmail());

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
//        UserBean userBean = (UserBean) beanFactory.getBean("userBean");
//        System.out.println(userBean.getUsername() + "," + userBean.getEmail());
        A a = (A)beanFactory.getBean("a");
        System.out.println("a de b de name = " + a.getB().getName());
        System.out.println("a name = " + a.getName());
        System.out.println("a de b = " + a.getB());
    }
}
