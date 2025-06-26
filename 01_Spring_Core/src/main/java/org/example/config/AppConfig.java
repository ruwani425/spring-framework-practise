package org.example.config;

import org.example.bean.MyConnection;
import org.example.bean.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//spring bean context ekata wetenne kohomada kiyala kiynne meken
//app ekata adla bean definition okkoma liyaganne me annotation eka dala tiyena class eka atule
@Configuration
//adala pakage eke tiyena component scan karanawa
//eta psse e class walin object  create karagena yanawa
//spring container eken me widiyata object create karagannawa
//new kiyala object hada hada inna ona ne
//@ComponentScan(basePackages = "org.example.bean")
//@ComponentScan(basePackageClasses = SpringBean.class)
//basePackageClasses -class eka kiyanna puluwan,class eka tiyena pakage eka hoyagannawa,e pakage eke @Component annotation dapu class tiken bean hadagannawa
//basePackages- pakage eka denna puluwan
@ComponentScan(basePackageClasses = TestBean1.class)
//bean tika hadagena context eka atulata dagnna me clss eka ona una
public class AppConfig {
    @Bean
        //me widiyata api kamati name ekakin daganna puluwam @Bean annotation eka issrhata name eka dala,method name eka wenas karanna beri nisa mehema karanna puluwan
        //@Bean("ruwani")
        // ape nowana class ekakin bean ekak haduwama bean id eka wenne method name eka
        //me name eka wenas karama ena error eka balanna
        //meken bean object ekak hadila context eka atulata wetenna kiyala kiyanne
    MyConnection myConnection() {
        return new MyConnection();
    }
}
