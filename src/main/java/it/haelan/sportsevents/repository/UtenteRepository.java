package it.haelan.sportsevents.repository;

import it.haelan.sportsevents.entity.Utente;
import org.springframework.data.repository.CrudRepository;

public interface UtenteRepository extends CrudRepository<Utente, Integer> {
}
