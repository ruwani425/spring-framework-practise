package org.example.config;

import org.example.bean.MyConnection;
import org.example.bean.TestBean1;
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
 * @since 2025-06-09
 */
//spring bean context ekata wetenne kohomada kiyala kiynne meken
@Configuration
//adala pakage eke tiyena component scan karanawa
//eta psse e class walin object  create karagena yanawa
//spring container eken me widiyata object create karagannawa
//new kiyala object hada hada inna ona ne
//@ComponentScan(basePackages = "org.example.bean")
//@ComponentScan(basePackageClasses = SpringBean.class)
//basePackageClasses -....hoyanna
@ComponentScan(basePackageClasses = TestBean1.class)
public class AppConfig {
    @Bean
        //me widiyata api kamati name ekakin daganna puluwam @Bean annotation eka issrhata name eka dala,method name eka wenas karanna beri nisa mehema karanna puluwan
        //@Bean("ruwani")
        // ape nowana class ekakin bean ekak haduwama bean id eka wenne method name eka
        //me name eka wenas karama ena error eka balanna
    MyConnection myConnection() {
        return new MyConnection();
    }
}
