package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {
    public HelloController() {
        System.out.println("HelloController constructor");
    }

    @GetMapping()
    public String sayHello() {
        return "index";
    }

//    @GetMapping()
//    public void sayHello2() {
//        return "Hello World2";
//    }
}
