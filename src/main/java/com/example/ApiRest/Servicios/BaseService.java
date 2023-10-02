package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.BaseEntidades;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends BaseEntidades, ID extends Serializable> {
    //Trea una lista de todas las entidades que están en la base de datos
    public List<E> findAll() throws Exception;
    //Trea a una entidad de acuerdo a un id pasado
    public E findById(ID id) throws Exception;
    //Crea una nueva entidad(Le enviamos una entidad al repository)
    public E save(E entity) throws Exception;
    //Recibe como parametro Id e identidad (identidad actualizada e id de la entidad que se quiere actualizar
    public E update (ID id, E entity) throws Exception;
    //Elima registros de la base de datos
    public boolean delete (ID id) throws Exception;
}
