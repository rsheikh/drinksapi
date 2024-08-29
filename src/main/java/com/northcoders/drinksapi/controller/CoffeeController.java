package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @GetMapping("/coffeelover")
    public String coffeelover(){
        return "I love coffee!";
    }

    @GetMapping("/")
    public Coffee coffeename(@RequestParam(defaultValue = "latte") String name) {
        return new Coffee(name);
    }
}
