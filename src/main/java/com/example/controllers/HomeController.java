package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/greeting")
    @ResponseBody
    public String greeting(@RequestParam(required = false, defaultValue = "World") String name) {
        return "<div>Hello, " + name + "</div>";
    }
}
