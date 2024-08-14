package com.esteve.fichajes.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table (name = "servicios")
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="precio_hora")
    private Float precio_hora;
    @Column(name="coste_hora")
    private Float coste_hora;
    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    private List<Tareas> tareas;


    public Servicios(Integer id, String nombre, String descripcion, Float precio_hora, Float coste_hora, List<Tareas> tareas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_hora = precio_hora;
        this.coste_hora = coste_hora;
        this.tareas = tareas;
    }

    public Servicios() {

    }

    @Override
    public String toString() {
        return "Servicios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio_hora=" + precio_hora +
                ", coste_hora=" + coste_hora +
                '}';
    }
}
