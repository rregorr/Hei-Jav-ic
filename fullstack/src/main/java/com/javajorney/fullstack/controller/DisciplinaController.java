package com.javajorney.fullstack.controller;

import com.javajorney.fullstack.model.Disciplina;
import com.javajorney.fullstack.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/disciplina") //define qual rota o cliente deve acessar para interagir com o recurso disciplina;
public class DisciplinaController {
        @Autowired//injeta uma instância de DisciplinaRepository em nosso Controller e depois criamos o método listar, o qual
        //recebe a anotação @GetMapping, caracterizando que esse método será ativado através de uma requisição com o uso do
        // Método GET direcionado à nossa rota principal + uri("/discipinas")
        DisciplinaRepository disciplinaRepository;
        @GetMapping
        @ResponseBody
        public List<Disciplina> listar(Model model) {
            return disciplinaRepository.findAll();
            /*O método listar utiliza a instancia disciplinaRepository e, através do método findAll() disponível
            nessa instância, se comunica com o banco de dados e retorna todas as disciplinas que estão no DB.
            Ou seja, ele realizou o equivalente a um SELECT * FROM disciplina e retornou os dados em uma lista.
            Como o método listar retorna uma List<Disciplina>, pegamos a lista de disciplinas que chegou do
            DB e colocamos no retorno. Pronto, o controller entrega esse retorno à view.*/
        }
    }
    /* Em resumo, o funcionamento será o seguinte:
    O cliente realiza a requisição GET para http://localhost:8080/disciplinas
    O Controller recebe essa requisição, roda o método correspondente, nesse caso, o listar.
     */


