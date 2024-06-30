package com.example.demo.models;

import edu.fbansept.demo.model.Question;
import jakarta.persistence.*;

@Entity
public class ReponsePossible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texte;

    private boolean estVrai;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public boolean isEstVrai() {
        return estVrai;
    }

    public void setEstVrai(boolean estVrai) {
        this.estVrai = estVrai;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
