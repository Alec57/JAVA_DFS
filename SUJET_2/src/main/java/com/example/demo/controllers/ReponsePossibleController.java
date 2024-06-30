package com.example.demo.controllers;

import com.example.demo.models.ReponsePossible;
import com.example.demo.services.ReponsePossibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reponses-possibles")
public class ReponsePossibleController {

    @Autowired
    private ReponsePossibleService reponsePossibleService;

    @PostMapping
    public ReponsePossible createReponsePossible(@RequestBody ReponsePossible reponsePossible) {
        return reponsePossibleService.save(reponsePossible);
    }

    @GetMapping
    public List<ReponsePossible> getAllReponsesPossibles() {
        return reponsePossibleService.findAll();
    }
}
