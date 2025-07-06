package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("one")
@RestController
public class WildCardMappingController {
    //one/test/hello - not matching
    //one//hello - not matching
    //one/123/hello - not matching
    //one/test/123/hello - matching
    @GetMapping("test/*/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("hello/*/*/")
    public String sayHelloTwo() {
        return "helloTwo";
    }

    //wrong
    //parana version walanam support
//    @GetMapping("hello/**")
//    public String sayHelloThree() {
//        return "helloThree";
//    }
}
