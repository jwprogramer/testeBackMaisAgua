package com.api.maisAgua.controllers;


import com.api.maisAgua.dtos.ProblemaDto;
import com.api.maisAgua.models.ProblemaModel;
import com.api.maisAgua.services.ProblemaService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/problema")
public class maisAguaController {

   final ProblemaService problemaService;

    public maisAguaController(ProblemaService problemaService) {
        this.problemaService = problemaService;
    }


    @PostMapping

    public ResponseEntity<Object> cadastrarProblema(@RequestBody @Valid ProblemaDto problemaDto){
        var problemaModel = new ProblemaModel();
        BeanUtils.copyProperties(problemaDto, problemaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(problemaService.save(problemaModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProblema(@PathVariable(value = "id") UUID id){
        Optional<ProblemaModel> parkingSpotModelOptional = problemaService.findById(id);
        if (!parkingSpotModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Problema não encontrado.");
        }
        problemaService.delete(parkingSpotModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Problema deletado.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarProblema(@PathVariable(value = "id") UUID id,
                                                    @RequestBody @Valid ProblemaDto problemaDto){
        Optional<ProblemaModel> problemaModelOptional = problemaService.findById(id);
        if (!problemaModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Problema não encontrado.");
        }
        var problemaModel = new ProblemaModel();
        problemaModel.setId(problemaModelOptional.get().getId());
        BeanUtils.copyProperties(problemaDto, problemaModelOptional);
        return ResponseEntity.status(HttpStatus.OK).body("Problema atualizado");
    }

}
