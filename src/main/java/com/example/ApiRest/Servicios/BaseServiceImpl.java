package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.BaseEntidades;
import com.example.ApiRest.Repositorios.BaseRepository;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends BaseEntidades, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository <E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository <E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }
    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            if(entities.isEmpty()) throw new Exception("No hay Registros");
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            if (!entityOptional.isPresent()) throw new Exception("No existe ningún registro con el ID indicado");
            return entityOptional.get();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            if (!entityOptional.isPresent()) throw new Exception("No existe ningún registro con el ID indicado");
            E entityUpdate = baseRepository.save(entity);
            return entityUpdate;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
