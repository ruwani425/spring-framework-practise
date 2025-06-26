package lk.ijse.gdse72;

import lk.ijse.gdse72.bean.Boy;
import lk.ijse.gdse72.config.AppConfig;
import lk.ijse.gdse72.di.Test2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        Boy boy = context.getBean(Boy.class);
//        System.out.println(boy);
//        boy.chatWithGirl();

        Test2 test2 = context.getBean(Test2.class);
        test2.calledHelloMethod();
        context.close();
    }
}