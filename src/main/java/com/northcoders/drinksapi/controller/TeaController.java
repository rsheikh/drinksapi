package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import com.northcoders.drinksapi.model.Tea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tea")
public class TeaController {

    @GetMapping("/tealovers")
    public String teaLover(){
        return "I love tea!";
    }

    @GetMapping("")
    public Tea teaname(@RequestParam(defaultValue = "black") String type,
                       @RequestParam(defaultValue = "Assam") String name) {

        return new Tea(name, type);
    }
}
