package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.Persona;
import com.example.ApiRest.Repositorios.BaseRepository;
import com.example.ApiRest.Repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl <Persona, Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
