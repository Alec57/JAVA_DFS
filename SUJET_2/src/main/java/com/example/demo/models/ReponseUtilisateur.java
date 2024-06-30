package com.example.demo.models;

import edu.fbansept.demo.model.Utilisateur;
import jakarta.persistence.*;


@Entity
public class ReponseUtilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "reponse_possible_id")
    private ReponsePossible reponsePossible;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public ReponsePossible getReponsePossible() {
        return reponsePossible;
    }

    public void setReponsePossible(ReponsePossible reponsePossible) {
        this.reponsePossible = reponsePossible;
    }
}
