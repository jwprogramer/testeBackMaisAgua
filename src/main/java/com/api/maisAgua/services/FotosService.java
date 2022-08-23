package com.api.maisAgua.services;


import com.api.maisAgua.models.FotosModel;
import com.api.maisAgua.repositories.FotosRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FotosService {


    public FotosModel savePhoto(FotosModel fotosModel, String nome_foto) {
        return FotosRepository.save(fotosModel,nome_foto);
    }
}
