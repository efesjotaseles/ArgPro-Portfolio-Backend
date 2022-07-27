package com.portfoliobackend.portfoliobackend.service;

import com.portfoliobackend.portfoliobackend.model.AcercaDe;
import com.portfoliobackend.portfoliobackend.repository.AcercaDeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcercaDeService {

    @Autowired
    private AcercaDeRepository repository;

    public List<AcercaDe> getAcercaDe(){
        return repository.findAll();
    }

    public AcercaDe findAcercaDe(Long id){
        return repository.findById(id).orElse(null);
    }

    public void createAcercaDe(AcercaDe acercaDe){
        repository.save(acercaDe);
    }

    public void deleteAcercaDe(Long id){
        repository.deleteById(id);
    }
}
