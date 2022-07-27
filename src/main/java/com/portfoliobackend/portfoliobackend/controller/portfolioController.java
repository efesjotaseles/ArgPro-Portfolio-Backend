package com.portfoliobackend.portfoliobackend.controller;

import com.portfoliobackend.portfoliobackend.service.AcercaDeService;
import com.portfoliobackend.portfoliobackend.service.EstudioService;
import com.portfoliobackend.portfoliobackend.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class portfolioController {

    @Autowired
    private ExperienciaService experienciaService;
    @Autowired
    private EstudioService estudioService;
    @Autowired
    private AcercaDeService acercaDeService;

}
