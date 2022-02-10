package com.javajorney.fullstack.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.beans.BeanProperty;

@Controller//Diz ao Spring que esta classe é um controller.
@RequestMapping("/")//mapeia as requisicoes
//de onde ela vem
public class HomeController {
    @ResponseBody
    @GetMapping
    public String hello() {
       return "Ola, Mundo!";
    }
}
