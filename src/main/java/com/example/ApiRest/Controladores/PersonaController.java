package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Persona;
import com.example.ApiRest.Servicios.PersonaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//Permite el acceso de la API desde distintos origenes(clientes)
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
    @GetMapping("/search")
    public ResponseEntity<?> search (@RequestParam String filtro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"Error\": \"" + e.getMessage() + "\"}"));

        }
    }

        @GetMapping("/searchPaged")
        public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable ) {
            try {
                return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
            }catch (Exception e ){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"Error\": \"" + e.getMessage() + "\"}"));

            }
    }
}

