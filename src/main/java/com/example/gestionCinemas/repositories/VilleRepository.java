package com.example.gestionCinemas.repositories;

import com.example.gestionCinemas.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository  extends JpaRepository<Ville, Long> {
}
