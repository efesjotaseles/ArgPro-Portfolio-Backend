package com.portfoliobackend.portfoliobackend.service;

import com.portfoliobackend.portfoliobackend.model.Estudio;
import com.portfoliobackend.portfoliobackend.repository.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudioService {

    @Autowired
    private EstudioRepository repository;

    public List<Estudio> getEstudios(){
        return repository.findAll();
    }

    public Estudio findEstudio(Long id){
        return repository.findById(id).orElse(null);
    }

    public void createEstudio(Estudio estudio){
        repository.save(estudio);
    }

    public void deleteEstudio(Long id){
        repository.deleteById(id);
    }
}
