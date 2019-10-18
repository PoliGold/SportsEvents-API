package it.haelan.sportsevents.controller;

import it.haelan.sportsevents.entity.Utente;
import it.haelan.sportsevents.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/utente")
public class UtenteController {

    @Autowired
    private UtenteRepository utenteRepository;

    @PostMapping("/add")
    public @ResponseBody String addNewUtente(@RequestParam String nome, @RequestParam String cognome,
                                             @RequestParam String email,@RequestParam String password,
                                             @RequestParam Integer ruolo){
        Utente utente = new Utente();
        utente.setNome(nome);
        utente.setCognome(cognome);
        utente.setEmail(email);
        utente.setPassword(password);
        utente.setRuolo(ruolo);

        utenteRepository.save(utente);

        return "Utente aggiunto";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Utente> getAllUtenti(){
        return utenteRepository.findAll();
    }

}
