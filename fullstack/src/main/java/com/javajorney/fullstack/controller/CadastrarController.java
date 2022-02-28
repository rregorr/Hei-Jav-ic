package com.javajorney.fullstack.controller;

import com.javajorney.fullstack.repository.QuestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.javajorney.fullstack.model.Questao;

import java.util.Map;

@Controller
@RequestMapping("/cadastrar")
public class CadastrarController {
    @Autowired
    QuestaoRepository questaoRepository;

    @PostMapping
    public String cadastrar (@ModelAttribute("questao") Questao questao) {//associacao questao da view e do objeto param
        questao.setTipo("Questao");
        Map<String, String> questions = Map.ofEntries(
                Map.entry("questao1", questao.getQuestao1()),
                Map.entry("questao2", questao.getQuestao2()),
                Map.entry("questao3", questao.getQuestao3()),
                Map.entry("questao4", questao.getQuestao4()),
                Map.entry("questao5", questao.getQuestao5())
        );

        String gabarito = questao.getGabarito();
        for(String chaveQuestao : questions.keySet()) {
            if(chaveQuestao.equals(gabarito)) {
                questao.setGabarito(questions.get(chaveQuestao));
            }
        }
        questaoRepository.save(questao);

            return "cadastro";

    }
}
