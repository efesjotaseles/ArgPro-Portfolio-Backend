package com.portfoliobackend.portfoliobackend.controller;

import com.portfoliobackend.portfoliobackend.model.Experiencia;
import com.portfoliobackend.portfoliobackend.service.AcercaDeService;
import com.portfoliobackend.portfoliobackend.service.EstudioService;
import com.portfoliobackend.portfoliobackend.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class portfolioController {

    @Autowired
    private ExperienciaService experienciaService;
    @Autowired
    private EstudioService estudioService;
    @Autowired
    private AcercaDeService acercaDeService;

    @GetMapping("/experiencias")
    public List<Experiencia> getExperiencias(){
        return experienciaService.getExperiencias();
    }

}
