package com.example.gestionCinemas.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "categorie")
    private Collection<Film> films;
}
