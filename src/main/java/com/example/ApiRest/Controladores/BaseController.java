package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.BaseEntidades;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends BaseEntidades, ID extends Serializable> {
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getAll(Pageable pageable);

    public ResponseEntity <?> getOne (@PathVariable ID id);
    public ResponseEntity<?> save (@RequestBody E entity);
    public ResponseEntity<?> upDate (@PathVariable ID id, @RequestBody E entity);
    public ResponseEntity<?> delete (@PathVariable ID id);
}

