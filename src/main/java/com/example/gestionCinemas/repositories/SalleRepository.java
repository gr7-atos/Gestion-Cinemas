package com.example.gestionCinemas.repositories;

import com.example.gestionCinemas.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository  extends JpaRepository<Salle, Long> {
}
