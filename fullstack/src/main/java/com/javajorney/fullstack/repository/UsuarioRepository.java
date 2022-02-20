package com.javajorney.fullstack.repository;

import com.javajorney.fullstack.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
//repository é um recurso do spring; o controller consulta o repository pra fazer o cadastro/receber no banco.
    //lembrando q fiz isso no proprio controller. Implementa o crud.
    //preciso criar um controller pra cada repository.
    //todo recurso q precisa realizar crud pela app, preciso de um repos pra cada classe do model.
}
