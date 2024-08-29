package com.northcoders.drinksapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tea")
public class TeaController {

    @GetMapping("/tealovers")
    public String teaLover(){
        return "I love tea!";
    }
}
