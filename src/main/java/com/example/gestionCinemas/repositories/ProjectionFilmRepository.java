package com.example.gestionCinemas.repositories;

import com.example.gestionCinemas.entities.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectionFilmRepository extends JpaRepository<ProjectionFilm, Long> {
}
