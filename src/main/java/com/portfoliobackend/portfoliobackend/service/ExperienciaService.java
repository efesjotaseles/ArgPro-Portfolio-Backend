package com.portfoliobackend.portfoliobackend.service;

import com.portfoliobackend.portfoliobackend.model.Experiencia;
import com.portfoliobackend.portfoliobackend.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService {

    @Autowired
    private ExperienciaRepository repository;

    public List<Experiencia> getExperiencias(){
        return repository.findAll();
    }

    public Experiencia findExperiencia(Long id){
        return repository.findById(id).orElse(null);
    }

    public void createExperiencia(Experiencia experiencia){
        repository.save(experiencia);
    }

    public void deleteExperiencia(Long id){
        repository.deleteById(id);
    }
}
