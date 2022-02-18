package com.javajorney.fullstack.model;

import javax.persistence.*;

@Entity//(name="questao") -- ???
//@Table(name="questao")
public class question {
    @ManyToOne
    private disciplina disciplina;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long fk_disciplina_id;
    @Column(length=50, nullable=false, unique=false)//eu teria que definir uma anotação por atributo???
    private String tipo;
    private String comando;
    private String questao1;
    private String questao2;
    private String questao3;
    private String questao4;
    private String questao5;
    private String gabarito;
    private String explicacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFk_disciplina_id() {
        return fk_disciplina_id;
    }

    public void setFk_disciplina_id(Long fk_disciplina_id) {
        this.fk_disciplina_id = fk_disciplina_id;
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
        return explicacao;
    }

    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }
}
