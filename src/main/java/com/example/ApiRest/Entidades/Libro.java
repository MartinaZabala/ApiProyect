package com.example.ApiRest.Entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name = "Libro")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Libro extends BaseEntidades{

    @Column(name = "fecha")
    public int fecha;
    @Column (name = "genero")
    public String genero;
    @Column (name = "paginas")
    private int paginas;
    @Column (name = "titulo")
    private String titulo;

    //Relacion Libro-Autor
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
