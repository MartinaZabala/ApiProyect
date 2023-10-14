package com.example.ApiRest.Entidades;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "Domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Domicilio extends BaseEntidades{
    @Column (name = "calle")
    private String calle;
    @Column (name = "numero")
    private int numero;

    //Relacion Domicilio-Localidad
    @ManyToOne(optional = false)//La localidad no puede ser nula a la hora de crear un domicilio
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
