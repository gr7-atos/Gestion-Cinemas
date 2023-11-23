package com.example.gestionCinemas;

import com.example.gestionCinemas.entities.Categorie;
import com.example.gestionCinemas.entities.Seance;
import com.example.gestionCinemas.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionCinemasApplication implements CommandLineRunner {

	@Autowired
	private CategorieRepository categorieRep;

	public static void main(String[] args) {
		SpringApplication.run(GestionCinemasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categorie categorie = new Categorie();
		categorie.setName("Horror");
		categorieRep.save(categorie);
	}
}
