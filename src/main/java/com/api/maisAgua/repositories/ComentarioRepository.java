package com.api.maisAgua.repositories;

import com.api.maisAgua.models.ComentarioModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ComentarioRepository extends JpaRepository<ComentarioModel, Id> {
}
