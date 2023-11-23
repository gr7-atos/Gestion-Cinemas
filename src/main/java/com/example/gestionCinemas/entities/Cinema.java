package com.example.gestionCinemas.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double longitude;
    private double latitude;
    private double altitude;
    private int nombreSalles;

    @ManyToOne
    private Ville ville;

    @OneToMany(mappedBy = "cinema", fetch=FetchType.EAGER)
    private Collection<Salle> salles;
}


//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