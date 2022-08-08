package com.api.maisAgua.repositories;

import com.api.maisAgua.models.ProblemaModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

@Repository
public interface ProblemaRepository extends JpaRepository<ProblemaModel, Long> {

    boolean existsByTipo(String tipo);

}
