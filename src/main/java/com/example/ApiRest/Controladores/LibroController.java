package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Libro;
import com.example.ApiRest.Servicios.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Permite el acceso de la API desde distintos origenes(clientes)
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libro")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
