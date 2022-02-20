package com.javajorney.fullstack.repository;

import com.javajorney.fullstack.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {//pega o identificador unico do tipo long
}
