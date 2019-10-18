package it.haelan.sportsevents.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Utente")
@EntityListeners(AuditingEntityListener.class)
public class Utente {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)

    private Integer idUtente;

    private String nome;
    private String cognome;
    private String email;
    private String password;
    private Integer ruolo;

    public Integer getIdUtente() {
        return idUtente;
    }

    public Utente setIdUtente(Integer idUtente) {
        this.idUtente = idUtente;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Utente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCognome() {
        return cognome;
    }

    public Utente setCognome(String cognome) {
        this.cognome = cognome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Utente setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Utente setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getRuolo() {
        return ruolo;
    }

    public Utente setRuolo(Integer ruolo) {
        this.ruolo = ruolo;
        return this;
    }

}
