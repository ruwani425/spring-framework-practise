package org.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//me bean ekak atule bean ekak hadena eka danmama light mode wenawa.
//config eke witrk bean annotation use karla bean hadala tibbot full mode wenawa
@Component
public class SpringBean3 {
    //configiration class eka atule code eka meke genalla dnma
    //me widiyata ape spring bean ekak atule dnna gyama interbean dependency satisfied karanne ne
    //@Component ekata priority eka wedi,eka mulin hadenawa
    //meka configuration class ekakadi karanam ekata kyanne spring full mode eka kyala
    //me wge spring bean ekak atulen beans tika context ekata wetenna kiyala tiyenam ekata kiyanne light mood eka kiyala
    @Bean
    public SpringBean1 springBean1() {
        //mehema new kyla hdanne nene spring wala
//        SpringBean2 springBean2 = new SpringBean2();

        //mehema pahala method eka call karala object eka set karanna puluwan
        //mewa interbean dependencies
        SpringBean2 springBean21 = springBean2();
        SpringBean2 springBean22 = springBean2();

        //me nikmma nikmm new object witarai.life cycle event run una bean neme
//        SpringBean2 springBean2 = new SpringBean2();
//        SpringBean1 springBean1 = new SpringBean1();
//        System.out.println(springBean1);
//        System.out.println(springBean2);

        //meka run wena piliwela balanna
        System.out.println(springBean21);
        System.out.println(springBean22);
        return new SpringBean1();
    }

    @Bean
    public SpringBean2 springBean2() {
        return new SpringBean2();
    }
}
