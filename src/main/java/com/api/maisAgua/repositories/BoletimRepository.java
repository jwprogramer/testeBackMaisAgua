package com.api.maisAgua.repositories;

import com.api.maisAgua.models.BoletimModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface BoletimRepository extends JpaRepository<BoletimModel, UUID> {

}

