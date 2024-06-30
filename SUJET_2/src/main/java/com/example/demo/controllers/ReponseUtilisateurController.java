package com.example.demo.controllers;

import com.example.demo.models.ReponseUtilisateur;
import com.example.demo.services.ReponseUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reponses-utilisateurs")
public class ReponseUtilisateurController {

    @Autowired
    private ReponseUtilisateurService reponseUtilisateurService;

    @PostMapping
    public ReponseUtilisateur createReponseUtilisateur(@RequestBody ReponseUtilisateur reponseUtilisateur) {
        return reponseUtilisateurService.save(reponseUtilisateur);
    }

    @GetMapping
    public List<ReponseUtilisateur> getAllReponsesUtilisateurs() {
        return reponseUtilisateurService.findAll();
    }
}
