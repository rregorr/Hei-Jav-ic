package com.javajorney.fullstack.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name="estudante")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;

    @ManyToMany//um mesmo usuário pode ter vários perfis; um perfil pode ser atribuido a varios usuarios. Assim, a classe
    //questões tbm vai ter @M2M. Como a cardinalidade é M2M, precisa fazer mapeamento @many-to-many
    //preciso decidir onde fará o "grosso" do mapeamento, e a outra classe vai precisar apenas da anotação
    // @many-to-many(mappedBy = "nomeDoAtributoNaOutraClasse")

    //Missão: precisamos fazer uma associação nessa tabela, criando nela um atributo referente a questão,
    // ou seja, você vai criar essa associação em Java Inserindo na classe Usuario o seguinte atributo:
    // private Questao questao. Agora, utilize o mapeamento @ManyToMany entre roles e usuario como referência
    // e mapeie a relação many-to-many de usuario com questao.
    private List<Questao> questoes = new ArrayList<>();

    @JoinTable (name="usuarios_roles", joinColumns = {
            @JoinColumn(name="id_usuario", referencedColumnName = "id") //
    }, inverseJoinColumns = {
            @JoinColumn(name="id_role", referencedColumnName = "id")
    }) //criar a tab de uniao...3a tab
    @ManyToMany
    private List<Role> roles = new ArrayList<>();

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

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }
}
