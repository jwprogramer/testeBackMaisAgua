package com.api.maisAgua.repositories;

import com.api.maisAgua.models.comentarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface comentarioRepository extends JpaRepository<comentarioModel, Long> {
}
