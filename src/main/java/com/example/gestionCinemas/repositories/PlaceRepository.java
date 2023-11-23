package com.example.gestionCinemas.repositories;

import com.example.gestionCinemas.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
