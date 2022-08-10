package com.api.maisAgua.controllers;


import com.api.maisAgua.dtos.PoblemaDto;
import com.api.maisAgua.models.ProblemaModel;
import com.api.maisAgua.services.ProblemaService;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/problema")
public class ProblemaController {

    final ProblemaService problemaService;

    public ProblemaController(ProblemaService problemaService) {
        this.problemaService = problemaService;
    }


    @PostMapping
    public ResponseEntity<Object> cadastrarProblema(@RequestBody @Valid PoblemaDto problemaDto){
        var problemaModel = new ProblemaModel();
        BeanUtils.copyProperties(problemaDto, problemaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(problemaService.save(problemaModel));
    }

    @GetMapping
    public ResponseEntity<Page<ProblemaModel>> listarProblemas(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(problemaService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarProblema(@PathVariable(value = "id") Long id){
        Optional<ProblemaModel> problemaModelOptional = problemaService.findById(id);
        if (!problemaModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Problema não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(problemaModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProblema(@PathVariable(value = "id") Long id){
        Optional<ProblemaModel> parkingSpotModelOptional = problemaService.findById(id);
        if (!parkingSpotModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Problema não encontrado.");
        }
        problemaService.delete(parkingSpotModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Problema deletado.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarProblema(@PathVariable(value = "id") Long id,
                                                    @RequestBody @Valid PoblemaDto problemaDto){
        Optional<ProblemaModel> problemaModelOptional = problemaService.findById(id);
        if (!problemaModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Problema não encontrado.");
        }
        var problemaModel = new ProblemaModel();
        problemaModel.setId_problema(problemaModelOptional.get().getId_problema());
        BeanUtils.copyProperties(problemaDto, problemaModelOptional);
        return ResponseEntity.status(HttpStatus.OK).body("Problema atualizado");
    }

}
