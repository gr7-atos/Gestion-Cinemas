package com.example.gestionCinemas.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int nombrePlaces;

    @ManyToOne()
    private Cinema cinema;

    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER)
    private Collection<Place> places;
}
