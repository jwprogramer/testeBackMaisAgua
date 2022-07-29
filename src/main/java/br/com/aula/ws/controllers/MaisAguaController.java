package br.com.aula.ws.controllers;


import br.com.aula.ws.dtos.ProblemaDto;
import br.com.aula.ws.models.ProblemaModel;
import br.com.aula.ws.services.ProblemaService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/Problema")
public class MaisAguaController {

    final ProblemaService problemaService;

    public MaisAguaController(ProblemaService problemaService) {
        this.problemaService = problemaService;
    }

    @PostMapping
    public ResponseEntity<Object> cadastrarProblema(@RequestBody @Valid ProblemaDto problemaDto){
        var problemaModel = new ProblemaModel();
        BeanUtils.copyProperties(problemaDto, problemaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(problemaService.save(problemaModel));
    }

}
