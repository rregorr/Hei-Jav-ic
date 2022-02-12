package com.javajorney.fullstack.controller;

import com.javajorney.fullstack.model.Autentica;
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

        for (int i = 0; i < usuarios.size(); i++) {
            if (autentica.getEmail().equals(usuarios.get(i).getEmail()) && autentica.getSenha().equals(usuarios.get(i).getSenha())) {
                return "cadastro";//em caso de sucesso, ir para pagina inicial
            }
        }
        model.addAttribute("loginError", true);

        return "login"; //em caso de erro, retornar à pagina de login

    }//diz à view que o objeto cujos
    //parametros é autentica é igual à view. mapeia autentica da view com autentica do controller.
}
