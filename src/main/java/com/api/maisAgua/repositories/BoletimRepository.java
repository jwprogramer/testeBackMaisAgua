package com.api.maisAgua.repositories;

import com.api.maisAgua.models.BoletimModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface BoletimRepository extends JpaRepository<BoletimModel, Id> {

    Optional<BoletimModel> findById(Long id);
}

