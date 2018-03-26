package com.tongyuan.testSpring;

import com.tongyuan.aop.Calculator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.UUID;

/**
 * Created by zhangcy on 2018/3/13
 */
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
 //         ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        UserBean userBean = (UserBean) ctx.getBean("userBean");
        ctx.close();
//        UUID roomFactoryBean1 = (UUID) ctx.getBean("roomFactoryBean1");
//        UUID roomFactoryBean2 = (UUID) ctx.getBean("roomFactoryBean2");
//        System.out.println(roomFactoryBean1);
//        System.out.println(roomFactoryBean2);
//        System.out.println(((UserBean)ctx.getBean("userFactoryBean")).getUsername());
//        System.out.println(ctx.getBean("&userFactoryBean"));

//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//        UserBean userBean = (UserBean) ctx.getBean("testbean");
//        System.out.println(userBean.getUsername() + "," + userBean.getEmail());


//        UserBean userBean = (UserBean) beanFactory.getBean("userBean");
//        System.out.println(userBean.getUsername() + "," + userBean.getEmail());

//        A a = (A)beanFactory.getBean("a");
//        System.out.println("a de b de name = " + a.getB().getName());
//        System.out.println("a name = " + a.getName());
//        System.out.println("a de b = " + a.getB());

//         Calculator calculator = (Calculator)beanFactory.getBean("calculator");
//         calculator.add(3.0,4.5);
    }
}
