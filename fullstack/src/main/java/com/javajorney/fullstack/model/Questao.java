package com.javajorney.fullstack.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Questao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne //Uma questão só pode ser elaborada por uma banca -- dúvida: Nâo seria O2O?
    @JoinColumn(name="fk_disciplina_id")
    private Disciplina disciplina;
    @Column(length=50, nullable=false, unique=false)//eu teria que definir uma anotação por atributo???
    private String tipo;
    private String comando;
    private String questao1;
    private String questao2;
    private String questao3;
    private String questao4;
    private String questao5;
    private String gabarito;
    @ManyToOne
    @JoinColumn(name="fk_ano_id")
    private Ano ano;
    @ManyToOne
    @JoinColumn(name="fk_banca_id")
    private Banca banca;

    //Missão: precisamos fazer uma associação nessa tabela, criando nela um atributo referente a questão,
    // ou seja, você vai criar essa associação em Java Inserindo na classe Usuario o seguinte atributo:
    // private Questao questao.
    // Agora, utilize o mapeamento @ManyToMany entre roles e usuario como referência
    // e mapeie a relação many-to-many de usuario com questao.
    @JoinTable(name="usuarios_questoes", joinColumns = {
            @JoinColumn(name="id_usuario", referencedColumnName = "id")
    }, inverseJoinColumns = {
            @JoinColumn(name="id_questao", referencedColumnName = "id")
    })

    private List<Questao> questoes = new ArrayList<>();

    private String comentario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getQuestao1() {
        return questao1;
    }

    public void setQuestao1(String questao1) {
        this.questao1 = questao1;
    }

    public String getQuestao2() {
        return questao2;
    }

    public void setQuestao2(String questao2) {
        this.questao2 = questao2;
    }

    public String getQuestao3() {
        return questao3;
    }

    public void setQuestao3(String questao3) {
        this.questao3 = questao3;
    }

    public String getQuestao4() {
        return questao4;
    }

    public void setQuestao4(String questao4) {
        this.questao4 = questao4;
    }

    public String getQuestao5() {
        return questao5;
    }

    public void setQuestao5(String questao5) {
        this.questao5 = questao5;
    }

    public String getGabarito() {
        return gabarito;
    }

    public void setGabarito(String gabarito) {
        this.gabarito = gabarito;
    }

    public String getExplicacao() {
        return comentario;
    }

    public void setExplicacao(String explicacao) {
        this.comentario = explicacao;
    }
}
