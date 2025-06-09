package org.example.bean;

import org.springframework.stereotype.Component;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-06-09
 */
@Component
//me widiyata apita ona namak bean ekata daganna puluwan,kamati widiyata define karanna puluwan
//@Component("ruwani")
public class TestBean2 {
    TestBean2() {
        System.out.println("TestBean2 Constructor");
    }
}
