package com.chamchi.blogapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class apiController {
    @GetMapping("/hello")
    public String hello() {
        return "hello from blog-api";
    }
}