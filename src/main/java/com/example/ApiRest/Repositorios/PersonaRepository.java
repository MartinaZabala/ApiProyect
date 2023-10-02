package com.example.ApiRest.Repositorios;

import com.example.ApiRest.Entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
