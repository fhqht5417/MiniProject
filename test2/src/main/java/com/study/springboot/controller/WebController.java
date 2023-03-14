package com.study.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WebController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name","대외비");
        model.addAttribute("img","image/image1.jpeg");
        return "hello";
    }

    @GetMapping("/")
    public String index(){
        return "home";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}


