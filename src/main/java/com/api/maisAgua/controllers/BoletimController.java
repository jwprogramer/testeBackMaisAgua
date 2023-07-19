package com.api.maisAgua.controllers;


import com.api.maisAgua.dtos.BoletimDto;
import com.api.maisAgua.models.BoletimModel;
import com.api.maisAgua.services.BoletimService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/boletim")
public class BoletimController {

    private final BoletimService boletimService;
    @Autowired
    public BoletimController(BoletimService boletimService) {
        this.boletimService = boletimService;
    }


    @PostMapping
    public ResponseEntity<Object> cadastrarBoletim(@RequestBody @Valid BoletimDto boletimDto){
        var boletimModel = new BoletimModel();
        BeanUtils.copyProperties(boletimDto, boletimModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(boletimService.save(boletimModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteBoletim(@PathVariable(value = "id") Long id){
        Optional<BoletimModel> BoletimModelOptional = boletimService.findById(id);
        if (!BoletimModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Boletim não encontrado.");
        }
        boletimService.delete(BoletimModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Boletim deletado.");
    }

    @GetMapping
    public ResponseEntity<List<BoletimModel>> listarBoletim(){
        return ResponseEntity.status(HttpStatus.OK).body(boletimService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarBoletim(@PathVariable(value = "id") Long id){
        Optional<BoletimModel> boletimModelOptional = boletimService.findById(id);
        if (!boletimModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Boletim não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(boletimModelOptional.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarBoletim(@PathVariable(value = "id") Long id,
                                                    @RequestBody @Valid BoletimDto boletimDto){
        Optional<BoletimModel> boletimModelOptional = boletimService.findById(id);
        if (!boletimModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Boletim não encontrado.");
        }
        var boletimModel = new BoletimModel();
        boletimModel.setId_boletim(boletimModelOptional.get().getId_boletim());
        BeanUtils.copyProperties(boletimDto, boletimModel);
        return ResponseEntity.status(HttpStatus.OK).body(boletimService.save(boletimModel));
    }

}
