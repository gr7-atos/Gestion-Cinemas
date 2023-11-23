package com.example.gestionCinemas.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private double duree;
    private String realisateur;
    private String description;
    private String photo;
    @Temporal(TemporalType.DATE)
    private Date dateSortie;

    @OneToMany(mappedBy = "film")
    private Collection<ProjectionFilm> projectionFilms;

    @ManyToOne
    private Categorie categorie;
}
