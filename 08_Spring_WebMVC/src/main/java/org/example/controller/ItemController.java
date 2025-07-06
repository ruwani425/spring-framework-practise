package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-06-30
 */
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
