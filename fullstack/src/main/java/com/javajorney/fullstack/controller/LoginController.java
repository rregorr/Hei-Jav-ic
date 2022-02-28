package com.javajorney.fullstack.controller;

import com.javajorney.fullstack.model.*;
import com.javajorney.fullstack.repository.AnoRepository;
import com.javajorney.fullstack.repository.BancaRepository;
import com.javajorney.fullstack.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/login")//corresponde à URI do action em login.html. Nomes devem ser iguais.
public class LoginController {
    @Autowired//injeta uma instância de DisciplinaRepository em nosso Controller.
    DisciplinaRepository disciplinaRepository;
    @Autowired//injeta uma instância de DisciplinaRepository em nosso Controller.
    BancaRepository bancaRepository;
    @Autowired//injeta uma instância de DisciplinaRepository em nosso Controller.
    AnoRepository anoRepository;

    @GetMapping//("/algumacoisa")
    public String login() {
        return "login";
    }

    @PostMapping
    public String autenticar (@ModelAttribute(value = "autentica") Autentica autentica, Model model) {
        Autentica usuario1 = new Autentica();
        Autentica usuario2 = new Autentica();

        usuario1.setEmail("fulano@gmail.com");
        usuario1.setSenha("2121");
        usuario1.setUsuario("fulano");
        usuario2.setEmail("fulano3@gmail.com");
        usuario2.setSenha("212");
        usuario2.setUsuario("fulano3");

        List<Autentica> usuarios = Arrays.asList(usuario1,usuario2);

        List<Disciplina> disciplinas = disciplinaRepository.findAll();
        model.addAttribute("disciplinas", disciplinas);
        List<Banca> bancas = bancaRepository.findAll();
        model.addAttribute("bancas", bancas);
        List<Ano> anos = anoRepository.findAll();
        model.addAttribute("anos", anos);

        //Aqui estamos criando uma lista de disciplinas e já populando ela com os dados de disciplinas vindos
        // do DB através do método findAll. Após isso, estamos usando a instância model que o thymeleaf
        // nos retorna no parâmetro de nosso método que é uma forma de passar dados do Controller para a view.
        // Como pode ver, estamos passando para a view a lista de disciplinas que acabamos de popular e colocamos
        // o nome "disciplinas" como chave para acessar esses dados na view. Poderíamos ter colocado qualquer
        // nome para essa chave, mas é claro que quanto mais coerente, melhor.
        // model.addAttribute("disciplinas", disciplinas); o primeiro parâmetro é a chave que usaremos para
        // recuperar os dados que estamos enviando para a View e o segundo parâmetro se refere ao que estamos
        // enviando em si.Pronto, a view já irá receber esses dados das disciplinas assim que fizermos o nosso
        // Login e entrarmos na página Home. :)

        model.addAttribute("questao", new Questao());


        for (int i = 0; i < usuarios.size(); i++) {
            if (autentica.getEmail().equals(usuarios.get(i).getEmail()) && autentica.getSenha().equals(usuarios.get
                    (i).getSenha())) {
                return "cadastro";//em caso de sucesso, ir para pagina inicial
            }
        }
        model.addAttribute("loginError", true);

        return "login"; //em caso de erro, retornar à pagina de login

    }//diz à view que o objeto cujos parametros é autentica é igual à view. mapeia autentica da view com autentica do controller.
    //Aplique esse código e você já terá as disciplinas à disposição na View.
}
