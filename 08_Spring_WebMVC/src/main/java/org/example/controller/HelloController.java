package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-06-23
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    public HelloController() {
        System.out.println("HelloController constructor");
    }

    @GetMapping("one")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("two")
    public String sayHello2() {
        return "Hello World2";
    }
}
