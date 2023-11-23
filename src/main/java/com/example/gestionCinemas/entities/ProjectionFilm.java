package com.example.gestionCinemas.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
public class ProjectionFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateProjection;
    private double prix;

    @OneToMany(mappedBy = "projectionFilm")
    private Collection<Ticket> tickets;

    @ManyToOne
    private Salle salle;

    @ManyToOne
    private Film film;

    @OneToOne
    private Seance seance;
}
