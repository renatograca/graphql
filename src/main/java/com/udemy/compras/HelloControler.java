package com.udemy.compras;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloControler {

    @GetMapping
    public String hello() {
        return "Hello world";
    }
}
