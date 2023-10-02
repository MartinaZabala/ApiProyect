package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Localidad;
import com.example.ApiRest.Servicios.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Permite el acceso de la API desde distintos origenes(clientes)
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidad")

public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
