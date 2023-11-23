package com.example.gestionCinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int nombrePlaces;

    @ManyToOne()
    private Cinema cinema;

    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER)
    private Collection<Place> places = new ArrayList<>();

    @OneToMany(mappedBy = "salle")
    private Collection<ProjectionFilm> projectionFilms;
}
