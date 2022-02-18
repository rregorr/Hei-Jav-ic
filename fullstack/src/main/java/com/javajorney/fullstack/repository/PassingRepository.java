package com.javajorney.fullstack.repository;

import com.javajorney.fullstack.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassingRepository extends JpaRepository<usuario,Long> {

}
