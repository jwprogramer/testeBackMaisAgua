package com.api.maisAgua.repositories;

import com.api.maisAgua.models.ProblemaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemaRepository extends JpaRepository<ProblemaModel, Long> {

    //boolean existsByTipoProblema(String tipoProblema);

}
