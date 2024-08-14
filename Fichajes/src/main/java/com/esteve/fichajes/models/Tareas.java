package com.esteve.fichajes.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tareas")
public class Tareas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio_hora")
    private Float precio_hora;
    @Column(name="coste_hora")
    private Float coste_hora;
    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyectos proyecto;
    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicios servicio;

    public Tareas(Integer id, String nombre, Float precio_hora, Float coste_hora, Proyectos proyecto, Servicios servicio) {
        this.id = id;
        this.nombre = nombre;
        this.precio_hora = precio_hora;
        this.coste_hora = coste_hora;
        this.proyecto = proyecto;
        this.servicio = servicio;
    }

    public Tareas() {

    }

    public Servicios getServicio() {
        return servicio;
    }

    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }

    public Proyectos getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyectos proyecto) {
        this.proyecto = proyecto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio_hora() {
        return precio_hora;
    }

    public void setPrecio_hora(Float precio_hora) {
        this.precio_hora = precio_hora;
    }

    public Float getCoste_hora() {
        return coste_hora;
    }

    public void setCoste_hora(Float coste_hora) {
        this.coste_hora = coste_hora;
    }

    @Override
    public String toString() {
        return "Tareas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio_hora=" + precio_hora +
                ", coste_hora=" + coste_hora +
                ", proyecto=" + proyecto +
                ", servicio=" + servicio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tareas tareas = (Tareas) o;
        return Objects.equals(id, tareas.id) && Objects.equals(nombre, tareas.nombre) && Objects.equals(precio_hora, tareas.precio_hora) && Objects.equals(coste_hora, tareas.coste_hora) && Objects.equals(proyecto, tareas.proyecto) && Objects.equals(servicio, tareas.servicio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio_hora, coste_hora, proyecto, servicio);
    }
}
