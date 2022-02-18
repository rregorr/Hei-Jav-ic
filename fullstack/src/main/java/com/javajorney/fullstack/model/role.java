package com.javajorney.fullstack.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name="perfil")
public class role {
    @OneToMany
    @JoinColumn(name="fk_role_id")
    //private usuario usuario;
    private List<usuario> usuario1 = new ArrayList<usuario>();

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
}
