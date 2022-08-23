package com.api.maisAgua.services;

import com.api.maisAgua.models.ComentarioModel;
import com.api.maisAgua.repositories.ComentarioRepository;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {

    final ComentarioRepository comentarioRepository;

    public ComentarioService(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    public ComentarioModel save(ComentarioModel comentarioModel) {
        return comentarioRepository.save(comentarioModel);
    }
}
