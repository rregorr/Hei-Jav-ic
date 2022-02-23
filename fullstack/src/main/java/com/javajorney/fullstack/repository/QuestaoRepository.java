package com.javajorney.fullstack.repository;
import com.javajorney.fullstack.model.Questao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestaoRepository extends JpaRepository <Questao, Long> {

}
