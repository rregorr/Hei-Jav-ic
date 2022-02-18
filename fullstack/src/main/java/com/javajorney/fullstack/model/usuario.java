package com.javajorney.fullstack.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="estudante")
public class usuario {
    @ManyToOne //porém, um mesmo usuário pode ter o perfil tanto adm quanto de estudante.
    private role perfil;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Long fk_role_id;
    private String senha;

    public usuario() {
    }

    public usuario(Long codigo, String nome) {
        this.id=id;
        this.nome = nome;
        this.email = email;
        this.fk_role_id = fk_role_id;
        this.senha = senha;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getFk_role_id() {
        return fk_role_id;
    }

    public void setFk_role_id(Long fk_role_id) {
        this.fk_role_id = fk_role_id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
