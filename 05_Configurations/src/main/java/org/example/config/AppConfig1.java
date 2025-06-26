package org.example.config;

import org.example.bean.A;
import org.example.bean.B;
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
//mekedi kare config class ekk atuledi tawa config class ekak register kara
//@Import({AppConfig2.class})
public class AppConfig1 {
//    @Bean
//    public SpringBeanOne springBeanOne() {
//        return new SpringBeanOne();
//    }

    @Bean
    public A a() {
        return new A();
    }

    @Bean
    public B b() {
        return new B();
    }
}
