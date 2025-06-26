package org.example.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    SpringBean() {
        System.out.println("SpringBean object created");
    }

    public void testBean() {
        System.out.println("testBean method called");
    }
}
