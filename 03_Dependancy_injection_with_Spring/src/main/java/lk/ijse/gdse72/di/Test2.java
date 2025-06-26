package lk.ijse.gdse72.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DIInterface{

    // Property injection (field injection)

//    @Autowired
//    DI test1 = new Test1();
//
//    public Test2() {
//        System.out.println("Test2 constructor called.");
//    }
//
//    public void calledhelloMethod(){
//        test1.sayHello();
//    }



    // Constructor through injection

//    DI test1;
//
//    @Autowired // meka mema dannath puluwan, aniwaya na. damath awlak na. (in constructor through injection @Autowired annotation is optional)
//    public Test2(DI t1) {
//        this.test1 = t1;
//    }
//
//    public void calledHelloMethod(){
//        test1.sayHello();
//    }


    // Setter method through injection

//    DI test1;
//
//    @Autowired // methanadi @Autowired ain karama test1 eka null wenawa.
//    public void setterMethod(DI t1) {
//        this.test1 = t1;
//    }
//
//    public void calledHelloMethod(){
//        test1.sayHello();
//    }


    // Interface through injection

    DI test1;

    @Autowired
    @Override
    public void inject(DI test1) {
        this.test1 = test1;
    }

    public void calledHelloMethod(){
        test1.sayHello();
    }
}
