package com.example.ApiRest.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "localidad")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Localidad extends BaseEntidades  {

    @Column(name = "denominacion")
    private String denominacion;
}
