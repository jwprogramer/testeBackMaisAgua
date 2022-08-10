package com.api.maisAgua.repositories;

import com.api.maisAgua.models.boletimModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface boletimRepository extends JpaRepository<boletimModel, Long> {

}

