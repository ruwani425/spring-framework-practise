package org.example.bean;

import org.springframework.stereotype.Component;

@Component
//me widiyata apita ona namak bean ekata daganna puluwan,kamati widiyata define karanna puluwan
//@Component("ruwani")
public class TestBean2 {
    TestBean2() {
        System.out.println("TestBean2 Constructor");
    }
}
