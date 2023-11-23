package com.example.gestionCinemas.repositories;

import com.example.gestionCinemas.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
