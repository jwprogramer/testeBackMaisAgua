package com.api.maisAgua.services;

import com.api.maisAgua.models.BoletimModel;
import com.api.maisAgua.models.ProblemaModel;
import com.api.maisAgua.repositories.BoletimRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BoletimService {

    final BoletimRepository boletimRepository;

    public BoletimService(BoletimRepository boletimRepository) {
        this.boletimRepository = boletimRepository;
    }

    @Transactional
    public BoletimModel save(BoletimModel boletimModel) {
        return boletimRepository.save(boletimModel);
    }

    @Transactional
    public Optional<BoletimModel> findById(Long id) {
        return boletimRepository.findById(id);
    }

    @Transactional
    public void delete(BoletimModel boletimModel) {
        boletimRepository.delete(boletimModel);
    }

    public List<BoletimModel> findAll( ) {
        return boletimRepository.findAll();
    }

}
