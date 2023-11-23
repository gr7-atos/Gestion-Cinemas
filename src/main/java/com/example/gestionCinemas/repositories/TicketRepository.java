package com.example.gestionCinemas.repositories;

import com.example.gestionCinemas.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository  extends JpaRepository<Ticket, Long> {
}
