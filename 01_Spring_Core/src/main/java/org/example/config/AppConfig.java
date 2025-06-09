package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-06-09
 */
//spring bean context ekata wetenne kohomada kiyala kiynne meken
@Configuration
//adala pakage eke tiyena component scan karanawa
//eta psse e class walin object  create karagena yanawa
//spring container eken me widiyata object create karagannawa
//new kiyala object hada hada inna ona ne
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {
}
