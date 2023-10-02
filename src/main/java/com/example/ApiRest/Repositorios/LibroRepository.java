package com.example.ApiRest.Repositorios;

import com.example.ApiRest.Entidades.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}
