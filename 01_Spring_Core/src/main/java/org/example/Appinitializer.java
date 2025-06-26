package org.example;

import org.example.bean.MyConnection;
import org.example.bean.SpringBean;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appinitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //AppConfig class eka context ekata daganna
        context.register(AppConfig.class);
        context.refresh();

        //methanadi eka object ekak create karala eka reuse karanna denawa
        //org.example.bean.SpringBean@76908cc0
        SpringBean bean = context.getBean(SpringBean.class);
        bean.testBean();
        System.out.println(bean);

//        TestBean1 bean1 = context.getBean(TestBean1.class);
//        System.out.println(bean1);
//        TestBean2 bean2 = context.getBean(TestBean2.class);
//        System.out.println(bean2);

        //meya balan inne application eka stop wenakam
        //antimata context.close walin close karala dnawa context eka
        //gc awilla collect karaganne neti nisa tmai mehema karanne
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//            System.out.println("JVM is about to be shut down");
//            context.close();
//        }));

//        TestBean3 bean3 = context.getBean(TestBean3.class);
        //mehema netnm uda comment karapu eke wge karanna puluwan

        //request bean from bean ID(Class Name (first letter -> simple letter)
        //class name ekamai ,but first letter eka simple -> testBean1
//        TestBean1 byBeanId = (TestBean1) context.getBean("testBean1");
//        System.out.println(byBeanId);
//        TestBean2 testBean2 = (TestBean2) context.getBean("testBean2", TestBean2.class);
//        System.out.println(testBean2);

        //object type eken return wena nisa cast kara
        MyConnection myConnection = (MyConnection) context.getBean("myConnection");
        System.out.println(myConnection);
        context.registerShutdownHook();
//        System.out.println(bean3);
    }

}
