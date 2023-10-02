package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.Autor;
import com.example.ApiRest.Repositorios.AutorRepository;
import com.example.ApiRest.Repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepositoryRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepositoryRepository) {
        super(baseRepository);
        this.autorRepositoryRepository = autorRepositoryRepository;
    }
}
