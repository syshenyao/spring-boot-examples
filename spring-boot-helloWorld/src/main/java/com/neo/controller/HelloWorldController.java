package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    @RequestMapping("/shenyao")
    public String shenyao() {
        return "Hello World";
    }
    
    @RequestMapping("/shenyao1")
    public String shenyao1() {
        return "Hello World";
    }
}