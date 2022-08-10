package com.api.maisAgua.services;

import com.api.maisAgua.models.boletimModel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class boletimService {

    final com.api.maisAgua.repositories.boletimRepository boletimRepository;

    public boletimService(com.api.maisAgua.repositories.boletimRepository boletimRepository) {
        this.boletimRepository = boletimRepository;
    }

    @Transactional
    public boletimModel save(boletimModel boletimModel) {
        return boletimRepository.save(boletimModel);
    }

    @Transactional
    public Optional<boletimModel> findById(Long id) {
        return boletimRepository.findById(id);
    }

    @Transactional
    public void delete(boletimModel boletimModel) {
        boletimRepository.delete(boletimModel);
    }
}
