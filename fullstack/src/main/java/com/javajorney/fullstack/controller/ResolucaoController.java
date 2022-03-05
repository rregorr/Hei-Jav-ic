package com.javajorney.fullstack.controller;

import com.javajorney.fullstack.model.Ano;
import com.javajorney.fullstack.model.Banca;
import com.javajorney.fullstack.model.Disciplina;
import com.javajorney.fullstack.model.Questao;
import com.javajorney.fullstack.repository.AnoRepository;
import com.javajorney.fullstack.repository.BancaRepository;
import com.javajorney.fullstack.repository.DisciplinaRepository;
import com.javajorney.fullstack.repository.QuestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/resolver")
public class ResolucaoController {
    @Autowired//injeta uma instância de DisciplinaRepository em nosso Controller.
    DisciplinaRepository disciplinaRepository;
    @Autowired//injeta uma instância de DisciplinaRepository em nosso Controller.
    BancaRepository bancaRepository;
    @Autowired//injeta uma instância de DisciplinaRepository em nosso Controller.
    AnoRepository anoRepository;
    @Autowired
    QuestaoRepository questaoRepository;

    @RequestMapping
    public String resolver (Model model) {
        List<Disciplina>  disciplina  = disciplinaRepository.findAll(); //busca a lista de disciplinas no banco
        model.addAttribute("disciplina", disciplina); //associa o objeto disciplina, com os dados
        //das disciplinas que vieram do banco, à propriedade "disciplina", definida na view.
        List<Banca> banca = bancaRepository.findAll();
        model.addAttribute("banca", banca);
        List<Ano> ano = anoRepository.findAll();
        model.addAttribute("ano", ano);

        Optional<Questao> questao = questaoRepository.findById(13l);
        model.addAttribute("ano", questao.get().getAno());
        model.addAttribute("banca", questao.get().getBanca());
        model.addAttribute("disciplina", questao.get().getDisciplina());
        model.addAttribute("comando", questao.get().getComando());
        model.addAttribute("questao1", questao.get().getQuestao1());
        model.addAttribute("questao2", questao.get().getQuestao2());
        model.addAttribute("questao3", questao.get().getQuestao3());
        model.addAttribute("questao4", questao.get().getQuestao4());
        model.addAttribute("questao5", questao.get().getQuestao5());
        //model.addAttribute("anoq", questao.get().getAno());
        model.addAttribute("comentarioq", questao.get().getComentario());

        return "resolucao";
        }

    }

