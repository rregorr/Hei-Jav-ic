package com.javajorney.fullstack.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name="perfil")
public class Role {
    @ManyToMany(mappedBy = "roles") //o spring automat cria 3 tabelas no bd.
    private List<Usuario> usuario1 = new ArrayList<Usuario>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}//
