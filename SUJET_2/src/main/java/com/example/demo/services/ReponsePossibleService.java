package com.example.demo.services;

import com.example.demo.models.ReponsePossible;
import com.example.demo.repositories.ReponsePossibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReponsePossibleService {

    @Autowired
    private ReponsePossibleRepository reponsePossibleRepository;

    public ReponsePossible save(ReponsePossible reponsePossible) {
        return reponsePossibleRepository.save(reponsePossible);
    }

    public List<ReponsePossible> findAll() {
        return reponsePossibleRepository.findAll();
    }
}
