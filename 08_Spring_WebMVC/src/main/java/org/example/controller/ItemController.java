package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("item")
public class ItemController {
    public ItemController() {
        System.out.println("item controller");
    }
    @GetMapping()
    public String sayHello() {
        return "item";
    }
}
