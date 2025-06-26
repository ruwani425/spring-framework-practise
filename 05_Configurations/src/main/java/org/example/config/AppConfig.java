package org.example.config;

import org.example.bean.SpringBean;
import org.springframework.context.annotation.*;

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
@Import({AppConfig1.class, AppConfig2.class})
@ComponentScan(basePackages = "org.example.bean")
//if config file in the root folder
//@ImportResource("classpath:hibernate.cfg.xml")
//if not in the root
//@ImportResource("file:absolute-path-of-hibernate.cfg.xml")
public class AppConfig {
    @Bean
    SpringBean springBean() {
        return new SpringBean();
    }
}
