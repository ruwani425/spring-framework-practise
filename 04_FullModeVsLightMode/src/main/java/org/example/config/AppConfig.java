package org.example.config;

import org.example.bean.SpringBean1;
import org.example.bean.SpringBean2;
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
public class AppConfig {

}
