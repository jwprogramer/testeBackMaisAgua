package br.com.aula.ws.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/maisAgua")
public class MaisAguaController {

    @GetMapping
    public ResponseEntity<Object> metodo1(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> metodo2(){
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
