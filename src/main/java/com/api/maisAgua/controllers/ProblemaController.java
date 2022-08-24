package com.api.maisAgua.controllers;


import com.api.maisAgua.dtos.ComentarioDto;
import com.api.maisAgua.dtos.ProblemaDto;
import com.api.maisAgua.models.ComentarioModel;
import com.api.maisAgua.models.FotosModel;
import com.api.maisAgua.models.ProblemaModel;
import com.api.maisAgua.services.ComentarioService;
import com.api.maisAgua.services.FotosService;
import com.api.maisAgua.services.ProblemaService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/problema")
public class ProblemaController {

    final ProblemaService problemaService;
    final FotosService fotosService;

    final ComentarioService comentarioService;

    public ProblemaController(ProblemaService problemaService, FotosService fotosService, ComentarioService comentarioService) {
        this.problemaService = problemaService;
        this.fotosService = fotosService;
        this.comentarioService = comentarioService;
    }


    @PostMapping
    public ResponseEntity<Object> cadastrarProblema(@RequestBody @Valid ProblemaDto problemaDto, @ModelAttribute FotosModel fotosModel, MultipartFile fotos){
        var problemaModel = new ProblemaModel();
        BeanUtils.copyProperties(problemaDto, problemaModel);
        //fotosService.savePhoto(fotosModel,fotos.getContentType());
        return ResponseEntity.status(HttpStatus.CREATED).body(problemaService.save(problemaModel));
    }

    @PostMapping("/comentario")
    public ResponseEntity<Object> cadastrarComentario(@RequestBody @Valid ComentarioDto comentarioDTO){
        var comentarioModel = new ComentarioModel();
        BeanUtils.copyProperties(comentarioDTO, comentarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(comentarioService.save(comentarioModel));
    }
    @DeleteMapping("/comentario/{id}")
    public ResponseEntity<Object> deleteComentario(@PathVariable(value = "id") Long id){
        Optional<ComentarioModel> ComentModelOptional = comentarioService.findById(id);
        comentarioService.delete(ComentModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Comentario deletado.");
    }


    @GetMapping
    public ResponseEntity<List<ProblemaModel>> listarProblemas(){
        return ResponseEntity.status(HttpStatus.OK).body(problemaService.findAll());
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
                                                    @RequestBody @Valid ProblemaDto problemaDto){
        Optional<ProblemaModel> problemaModelOptional = problemaService.findById(id);
        if (!problemaModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Problema não encontrado.");
        }
        var problemaModel = new ProblemaModel();
        problemaModel.setId_problema(problemaModelOptional.get().getId_problema());
        BeanUtils.copyProperties(problemaDto, problemaModel);
        return ResponseEntity.status(HttpStatus.OK).body(problemaService.save(problemaModel));
    }

}
