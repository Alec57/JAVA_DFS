package com.example.demo.services;

import com.example.demo.models.ReponseUtilisateur;
import com.example.demo.repositories.ReponseUtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReponseUtilisateurService {

    @Autowired
    private ReponseUtilisateurRepository reponseUtilisateurRepository;

    public ReponseUtilisateur save(ReponseUtilisateur reponseUtilisateur) {
        return reponseUtilisateurRepository.save(reponseUtilisateur);
    }

    public List<ReponseUtilisateur> findAll() {
        return reponseUtilisateurRepository.findAll();
    }
}
