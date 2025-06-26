package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-06-23
 */
@Component
public class SpringBean implements InitializingBean {
    @Value("Hello")
    private String a;

    //null print wenne initializing bean awastawa nisa
    public SpringBean() {
        System.out.println(a);
    }

    //meka tmai mulinma cl wenne
    //ekata hetuwa mokakda kiyala balanna
//    public SpringBean() {
//        System.out.println("SpringBean");
//    }

    //run time value ekk inject karanna puluwan
    //ekata @value use karanawa
    //@value ayin karala balanna error eka
    //eka netuwa dnmot error ekak enawa
//    @Autowired //meka ayin karala balanna mokada wenne kyala,meyawa inject karaganna kiyalai meka daala qwe
//    @Autowired(required = false)
//    public SpringBean(@Value("hello") String a, @Value("20") int number, @Value("true") boolean value) {
//        System.out.println("SpringBean constructor called");
//        System.out.println(a);
//        System.out.println(number);
//        System.out.println(value);
//    }

    //@Autowired annotation eka methanatt dala balanna mokada wenne kiyala
    //eka para constructor dekatama eka dnna be
    //hebei @Autowired(required = false) karot nm error eka enne ne
    //true karala balanna aye error eka enawa
    //dekatama @Autowired(required=false) dammata passe wedima parameter gana tiyena constructor eka tmai run wenne
//    @Autowired(required = false)
//    public SpringBean(@Value("3") int a, @Value("3") int b, @Value("true") boolean value) {
//        System.out.println("SpringBean constructor called");
//    }

    //mekedi property ekata value set wena nisa mekedi value eka print wenawa
    //meke anik ewa comment karala meka no args constructor ekai,uda property ekai ekka check karanna
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(a);
    }
}
