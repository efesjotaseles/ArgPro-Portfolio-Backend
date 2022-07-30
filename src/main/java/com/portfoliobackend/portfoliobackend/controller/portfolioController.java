package com.portfoliobackend.portfoliobackend.controller;

import com.portfoliobackend.portfoliobackend.model.AcercaDe;
import com.portfoliobackend.portfoliobackend.model.Estudio;
import com.portfoliobackend.portfoliobackend.model.Experiencia;
import com.portfoliobackend.portfoliobackend.service.AcercaDeService;
import com.portfoliobackend.portfoliobackend.service.EstudioService;
import com.portfoliobackend.portfoliobackend.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class portfolioController {

    @Autowired
    private ExperienciaService experienciaService;
    @Autowired
    private EstudioService estudioService;
    @Autowired
    private AcercaDeService acercaDeService;

    @GetMapping("/experiencias/traerlista")
    public List<Experiencia> getExperiencias(){
        return experienciaService.getExperiencias();
    }

    @GetMapping("/experiencias/traer/{id}")
    public Experiencia findExperiencia(@PathVariable Long id){
        return experienciaService.findExperiencia(id);
    }

    @PostMapping("/experiencias/alta")
    public void createExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.createExperiencia(experiencia);
    }

    @PutMapping("/experiencias/modificar/{id}")
    public void updateExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia){
        experiencia.setId(id);
        experienciaService.createExperiencia(experiencia);
    }

    @GetMapping("/estudios/traerlista")
    public List<Estudio> getEstudios(){
        return estudioService.getEstudios();
    }

    @GetMapping("/estudios/traer/{id}")
    public Estudio findEstudio(@PathVariable Long id){
        return estudioService.findEstudio(id);
    }

    @PostMapping("/estudios/alta")
    public void createEstudio(@RequestBody Estudio estudio){
        estudioService.createEstudio(estudio);
    }

    @PutMapping("/estudios/modificar/{id}")
    public void updateEstudio(@PathVariable Long id , @RequestBody Estudio estudio){
        estudio.setId(id);
        estudioService.createEstudio(estudio);
    }

    @GetMapping("/acercade")
    public AcercaDe acercaDe(){
        return acercaDeService.findAcercaDe(0L);
    }

    @PostMapping("acercade/alta")
    public void crearAcercaDe(@RequestBody AcercaDe acercaDe){
        acercaDeService.createAcercaDe(acercaDe);
    }

    //A sabiendas de que el método hace lo mismo que el de alta, igualmente lo separo para segmentar funcionalidades
    @PutMapping("/acercade/modificar")
    public void updateAcercaDe(@RequestBody AcercaDe acercaDe){
        acercaDeService.createAcercaDe(acercaDe);
    }

}
