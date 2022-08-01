package com.api.maisAgua.repositories;

import com.api.maisAgua.models.BoletimModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BoletimRepository extends JpaRepository<BoletimModel, UUID> {

}

