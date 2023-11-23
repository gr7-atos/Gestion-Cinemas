package com.example.gestionCinemas.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private double longitude;
    private double latitude;
    private double altitude;

    @ManyToOne
    private Salle salle;

    @OneToMany(mappedBy = "place")
    private Collection<Ticket> tickets;
}
