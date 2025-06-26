package lk.ijse.gdse72.config;

import lk.ijse.gdse72.bean.MyConnection;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
//@ComponentScan(basePackages = "lk.ijse.gdse72.bean")
//public class AppConfig {
//    @Bean
////    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // @Bean annotation ekath ekkath @Scope eka use karala ganna puluwan.
//    @Scope("prototype")
//    MyConnection getMyConnection() {
//        return new MyConnection();
//    }
//}

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse72.bean")
public class AppConfig {
    @Bean
    @Scope("prototype")
    MyConnection getMyConnection() {
        return new MyConnection();
    }
}
