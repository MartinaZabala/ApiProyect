package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.Libro;
import com.example.ApiRest.Repositorios.BaseRepository;
import com.example.ApiRest.Repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl <Libro, Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}