package com.example.gestionCinemas.repositories;

import com.example.gestionCinemas.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
