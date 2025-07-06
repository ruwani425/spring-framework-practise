package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exact")
public class ExactMappingController {
    @GetMapping(path = "/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/hello/two")
    public String sayHelloTwoMapping() {
        return "hello two Mapping";
    }

    @GetMapping("/hello/two/api")
    public String sayHelloThreeMapping() {
        return "hello three Mapping";
    }
}
