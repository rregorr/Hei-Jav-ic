package com.javajorney.fullstack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
    @ResponseBody
    public String hello() {
       return "Ola, mundaoooo!";
    }
}
