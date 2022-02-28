package com.javajorney.fullstack.controller;

import com.javajorney.fullstack.model.Disciplina;
import com.javajorney.fullstack.model.Questao;
import com.javajorney.fullstack.repository.AnoRepository;
import com.javajorney.fullstack.repository.BancaRepository;
import com.javajorney.fullstack.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/resolver")
public class ResolucaoController {
    @Autowired//injeta uma instância de DisciplinaRepository em nosso Controller.
    DisciplinaRepository disciplinaRepository;
    @Autowired//injeta uma instância de DisciplinaRepository em nosso Controller.
    BancaRepository bancaRepository;
    @Autowired//injeta uma instância de DisciplinaRepository em nosso Controller.
    AnoRepository anoRepository;

    @RequestMapping
    public String resolver (Model model) {
        List<Disciplina>  disciplina  = disciplinaRepository.findAll(); //busca a lista de disciplinas no banco
        model.addAttribute("disciplina", disciplina); //associa a entidade disciplina do banco à propriedade disciplina, da view
        /*bancas = bancaRepository.findAll();
        model.addAttribute("bancas", bancas);
        anos = anoRepository.findAll();
        model.addAttribute("anos", anos);*/

        return "resolucao";
        }

    }

