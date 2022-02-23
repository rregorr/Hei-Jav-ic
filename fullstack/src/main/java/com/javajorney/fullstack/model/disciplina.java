package com.javajorney.fullstack.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Disciplina {
    @OneToMany(mappedBy = "disciplina") //pois uma disciplina contem diversas questões
    //private question questao;
    private List<Questao> questoes = new ArrayList<Questao>();//lista no lado o2m???

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

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }
}
