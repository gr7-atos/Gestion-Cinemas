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
public class ProjectionFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
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
