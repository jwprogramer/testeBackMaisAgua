package com.api.maisAgua.services;

import com.api.maisAgua.models.ComentarioModel;
import com.api.maisAgua.repositories.ComentarioRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ComentarioService {

    final ComentarioRepository comentarioRepository;

    public ComentarioService(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    public ComentarioModel save(ComentarioModel comentarioModel) {
        return comentarioRepository.save(comentarioModel);
    }

    public Optional<ComentarioModel> findById(Long id) { return comentarioRepository.findById(id);
    }
    @Transactional
    public void delete(ComentarioModel comentarioModel) {
        comentarioRepository.delete(comentarioModel);
    }
}
