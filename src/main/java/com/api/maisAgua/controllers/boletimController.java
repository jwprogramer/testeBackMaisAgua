package com.api.maisAgua.controllers;


import com.api.maisAgua.dtos.BoletimDto;
import com.api.maisAgua.dtos.ProblemaDto;
import com.api.maisAgua.models.BoletimModel;
import com.api.maisAgua.models.ProblemaModel;
import com.api.maisAgua.services.BoletimService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/boletim")
public class boletimController {

    final BoletimService boletimService;

    public boletimController(BoletimService boletimService) {
        this.boletimService = boletimService;
    }


    @PostMapping
    public ResponseEntity<Object> cadastrarProblema(@RequestBody @Valid BoletimDto boletimDto){
        var boletimModel = new BoletimModel();
        BeanUtils.copyProperties(boletimDto, boletimService);
        return ResponseEntity.status(HttpStatus.CREATED).body(boletimService.save(boletimModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProblema(@PathVariable(value = "id") Long id){
        Optional<BoletimModel> parkingSpotModelOptional = boletimService.findById(id);
        if (!parkingSpotModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Boletim não encontrado.");
        }
        boletimService.delete(parkingSpotModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Boletim deletado.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarProblema(@PathVariable(value = "id") Long id,
                                                    @RequestBody @Valid BoletimDto boletimDto){
        Optional<BoletimModel> boletimModelModelOptional = boletimService.findById(id);
        if (!boletimModelModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Boletim não encontrado.");
        }
        var boletimModel = new BoletimModel();
        boletimModel.setId_boletim(boletimModelModelOptional.get().getId_boletim());
        BeanUtils.copyProperties(boletimDto, boletimModelModelOptional);
        return ResponseEntity.status(HttpStatus.OK).body("Boletim atualizado");
    }

}
