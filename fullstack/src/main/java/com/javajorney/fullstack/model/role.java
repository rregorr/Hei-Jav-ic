package com.javajorney.fullstack.model;

import javax.persistence.*;

@Entity
@Table(name="perfil")
public class role {
    @OneToMany
    private usuario usuario;
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
