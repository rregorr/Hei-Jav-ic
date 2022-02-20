package com.javajorney.fullstack.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Disciplina {
    @OneToMany //pois uma disciplina contem diversas questões
    @JoinColumn(name="fk_disciplina_id")//aponta qual a fk em question
    //private question questao;
    private List<Question> question = new ArrayList<Question>();//lista no lado o2m???


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//posso seter AUTO???
    private Long id;
    String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
