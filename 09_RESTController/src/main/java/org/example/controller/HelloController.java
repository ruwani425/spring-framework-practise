package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello") //servlet ekak identifier karaganna
public class HelloController {
    @GetMapping
    public String hello() {
        return "hello";
    }

    @PostMapping
    public String sayHello() {
        return "hello post mapping";
    }
    @PutMapping
    public String sayHelloPutMapping() {
        return "hello putMapping";
    }

    @DeleteMapping
    public String deleteMapping() {
        return "hello deleteMapping";
    }

    @PatchMapping
    public String patchMapping() {
        return "hello patchMapping";
    }

    //ekama path eken get mapping danna be.error enawa.e nisa path wenas karanna ona
//    @GetMapping
    @GetMapping("one")
    public String helloWorld() {
        return "hello world";
    }
}
