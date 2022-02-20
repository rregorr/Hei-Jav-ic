package com.javajorney.fullstack.controller;

import com.javajorney.fullstack.model.Usuario;
import com.javajorney.fullstack.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/usuarios")//pode ser qqr coisa...recomendavel conceito do recurso
public class UsuarioController {
    @Autowired //injeta uma instancia da classe UsuarioRepository na classe UsuarioController
    UsuarioRepository usuarioRepository;

    @GetMapping
    @ResponseBody //vai ser entregue o q vem do BD; sem ela, retorna pagina html
    public List<Usuario> listarUsuarios () {//retorna lista de usuarios
        return usuarioRepository.findAll();

    }
}
