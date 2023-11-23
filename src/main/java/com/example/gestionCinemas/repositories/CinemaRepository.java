package com.example.gestionCinemas.repositories;

import com.example.gestionCinemas.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Long>{
}
