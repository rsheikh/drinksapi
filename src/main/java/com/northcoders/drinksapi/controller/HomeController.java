package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    CoffeeController coffeeController;

    @GetMapping("/health")
    public ResponseEntity<String> getHeathCheck() {

        return ResponseEntity.ok("Api is up and running!");
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the Drinks API!";
    }

    @GetMapping("/coffeelover")
    public String coffeelover(){
        return coffeeController.coffeelover();
    }

    @GetMapping("/coffee")
    public Coffee coffeename(@RequestParam(defaultValue = "latte") String name) {
        return coffeeController.coffeename(name);
    }
}
