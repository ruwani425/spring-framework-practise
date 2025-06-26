package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
//meka hoyala lyanna
@PropertySource("classpath:application.properties")
public class AppConfig {

}
