package org.example;

import org.example.bean.*;
import org.example.config.AppConfig;
import org.example.config.AppConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appinitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
//        context.register(AppConfig2.class);
        context.refresh();

        //configuration class one
//        SpringBeanOne bean = context.getBean(SpringBeanOne.class);
//        System.out.println("spring bean  one ---- "+bean);
//        SpringBeanOne bean1 = context.getBean(SpringBeanOne.class);
//        System.out.println("spring bean  one ---- "+bean1);

        //configuration class two
//        SpringBeanTwo bean2 = context.getBean(SpringBeanTwo.class);
//        System.out.println("spring bean two ---- "+bean2);
//        SpringBeanTwo beanTwo = context.getBean(SpringBeanTwo.class);
//        System.out.println("spring bean two ---- "+beanTwo);


        //exercise

        SpringBean bean = context.getBean(SpringBean.class);
        System.out.println("Spring bean : " + bean);
        A a = context.getBean(A.class);
        System.out.println("bean a:"+a);
        B b = context.getBean(B.class);
        System.out.println("bean b:"+b);
        C c = context.getBean(C.class);
        System.out.println("bean c:"+c);
        D d = context.getBean(D.class);
        System.out.println("bean d:"+d);
        context.registerShutdownHook();
    }
}
