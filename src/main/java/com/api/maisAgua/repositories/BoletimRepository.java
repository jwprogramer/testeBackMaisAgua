package com.api.maisAgua.repositories;

import com.api.maisAgua.models.BoletimModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletimRepository extends JpaRepository<BoletimModel, Long> {

}

