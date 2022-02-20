package com.javajorney.fullstack.repository;

import com.javajorney.fullstack.model.Banca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancaRepository extends JpaRepository<Banca, Long> {
}
