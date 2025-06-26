package lk.ijse.gdse72;

import lk.ijse.gdse72.bean.MyConnection;
import lk.ijse.gdse72.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        SpringBean bean1 = context.getBean(SpringBean.class);
//        System.out.println(bean1);
//
//        SpringBean bean2 = context.getBean(SpringBean.class);
//        System.out.println(bean2);

//        MyConnection myConnection1 = context.getBean(MyConnection.class);
//        System.out.println(myConnection1);
//
//        MyConnection myConnection2 = context.getBean(MyConnection.class);
//        System.out.println(myConnection2);

//        context.registerShutdownHook();
        context.close();
    }
}