package com.example.gestionCinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
