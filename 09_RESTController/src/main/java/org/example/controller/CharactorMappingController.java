package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/char")
public class CharactorMappingController {

    //IP12
    //I1
    //me wage I ekath ekka monahri character 3 k enna ona
    @GetMapping(path = "item/I???")
    public String sayHello (){
        return "hello";
    }
    @GetMapping(path = "????/search")
    public String sayHelloGetMapping(){
        return "helloGetMapping";
    }
}
