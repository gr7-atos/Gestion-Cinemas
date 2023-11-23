package com.example.gestionCinemas.repositories;

import com.example.gestionCinemas.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository  extends JpaRepository<Seance, Long> {
}
