package com.api.maisAgua.repositories;

import com.api.maisAgua.models.FotosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FotosRepository extends JpaRepository<FotosModel, Long>{

    static FotosModel save(FotosModel fotosModel, String nome_foto) {
        return fotosModel;
    }
}
