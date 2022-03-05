package com.javajorney.fullstack.controller;

import com.javajorney.fullstack.model.Questao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/resposta")
public class RespostaController {
    @PostMapping
    public String responder (@ModelAttribute("questao") Questao questao) {



}
