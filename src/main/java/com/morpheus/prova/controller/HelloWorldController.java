package com.morpheus.prova.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldController
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @GetMapping(value = "")
    public String hello() {
        return "Hello World";
    }
    
}