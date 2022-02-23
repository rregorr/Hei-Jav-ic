package com.javajorney.fullstack.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ano;
    @OneToMany(mappedBy = "ano")//Aqui não cabe colocar @JoinColumn, pois ela deve ser colocada na entidade
    // que recebe a chave estrangeira. Nesse caso, a entidade question recebe a chave estrangeira de ano,
    // que intitulamos de fk_ano_id. Então, na classe ano a gente só usa o mapped by para indicar no
    // atributo questoes da classe Ano que o atributo ano da classe Question é quem tá mapeando a relação.
    // Ela informa para o lado 1 da relaçao que o atributo referente a lista de usuarios, por exemplo nesse
    // caso, está relacionada à associação mapeada no atributo intitulado ano na classe Usuario.
    private List<Questao> questao;//não gerar gs

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public List<Questao> getQuestao() {
        return questao;
    }

    public void setQuestao(List<Questao> questao) {
        this.questao = questao;
    }
}
