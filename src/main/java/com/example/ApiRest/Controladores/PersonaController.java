package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Persona;
import com.example.ApiRest.Servicios.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
//Permite el acceso de la API desde distintos origenes(clientes)
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

    }

