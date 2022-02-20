package com.javajorney.fullstack.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name="estudante")
public class Usuario {
    //@ManyToMany //porém, um mesmo usuário pode ter o perfil tanto adm quanto de estudante.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    @ManyToMany
    @JoinTable (name="usuarios_roles", joinColumns = {
            @JoinColumn(name="id_usuario", referencedColumnName = "id") //
    }, inverseJoinColumns = {
            @JoinColumn(name="id_role", referencedColumnName = "id")
    }) //criar a tab de uniao...3a tab
    private List<Role> roles = new ArrayList<>();
    private String senha;

    public Usuario() {
    }

    public Usuario(Long codigo, String nome) {
        this.id=id;
        this.nome = nome;
        this.email = email;
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

     public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
