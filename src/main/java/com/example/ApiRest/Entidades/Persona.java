package com.example.ApiRest.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Persona extends BaseEntidades {


    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni")
    private int dni;

    //Relacion Persona-Domicilio
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;


    //Relacion Persona-Libro
    //OrphanRemoval: Al eliminar una persona, también se eliminaran los libros de esa persona
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinTable(
            name = "persona_libro",
    joinColumns = @JoinColumn(name = "persona_id"),
    inverseJoinColumns = @JoinColumn(name = "libro_id"))
    private List<Libro> libros = new ArrayList<Libro>();
}
