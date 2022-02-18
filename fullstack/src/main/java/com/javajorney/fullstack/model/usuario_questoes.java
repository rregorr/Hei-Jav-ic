package com.javajorney.fullstack.model;

import javax.persistence.*;

@Entity
@Table(name="usuario_questao")
public class usuario_questoes {
    @ManyToOne
    private usuario usuario;
    @ManyToOne
    private question questao;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private Long id_questao;

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_questao() {
        return id_questao;
    }

    public void setId_questao(Long id_questao) {
        this.id_questao = id_questao;
    }
}
