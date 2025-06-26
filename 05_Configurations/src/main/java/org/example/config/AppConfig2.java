package org.example.config;

import org.example.bean.C;
import org.example.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-06-23
 */
@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig2 {
    //    @Bean
//    public SpringBeanTwo springBeanTwo() {
//        return new SpringBeanTwo();
//    }
    @Bean
    public C c() {
        return new C();
    }

    @Bean
    public D d() {
        return new D();
    }
}
