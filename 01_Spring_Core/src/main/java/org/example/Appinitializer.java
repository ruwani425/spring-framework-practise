package org.example;

import org.example.bean.SpringBean;
import org.example.bean.TestBean1;
import org.example.bean.TestBean2;
import org.example.bean.TestBean3;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-06-09
 */
public class Appinitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        //methanadi eka object ekak create karala eka reuse karanna denawa
        //org.example.bean.SpringBean@76908cc0
        SpringBean bean = context.getBean(SpringBean.class);
        bean.testBean();
        System.out.println(bean);

        TestBean1 bean1 = context.getBean(TestBean1.class);
        System.out.println(bean1);
        TestBean2 bean2 = context.getBean(TestBean2.class);
        System.out.println(bean2);
//        //close wenakam beans tika context eke tiyagena inne
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//            System.out.println("JVM is about to be shut down");
//            context.close();
//        }));
        TestBean3 bean3 = context.getBean(TestBean3.class);
        //mehema netnm uda comment karapu eke wge karanna puluwan
        context.registerShutdownHook();
        System.out.println(bean3);
    }

}
