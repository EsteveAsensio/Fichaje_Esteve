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
    @Column(name="beneficio_hora")
    private Float beneficio_hora;
    @Column(name="total_ventas")
    private Float total_ventas;
    @Column(name="total_costes")
    private Float total_costes;
    @Column(name="total_beneficios")
    private Float total_beneficios;

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyectos proyecto;
    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicios servicio;
    @OneToMany(mappedBy = "tarea", cascade = CascadeType.ALL)
    private List<Imputaciones> imputaciones;

    public Tareas(Integer id, Float precio_hora, String nombre, Float coste_hora, Float beneficio_hora, Float total_ventas, Float total_costes, Float total_beneficios, Proyectos proyecto, Servicios servicio, List<Imputaciones> imputaciones) {
        this.id = id;
        this.precio_hora = precio_hora;
        this.nombre = nombre;
        this.coste_hora = coste_hora;
        this.beneficio_hora = beneficio_hora;
        this.total_ventas = total_ventas;
        this.total_costes = total_costes;
        this.total_beneficios = total_beneficios;
        this.proyecto = proyecto;
        this.servicio = servicio;
        this.imputaciones = imputaciones;
    }

    public Tareas() {

    }

    @Override
    public String toString() {
        return "Tareas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio_hora=" + precio_hora +
                ", coste_hora=" + coste_hora +
                ", beneficio_hora=" + beneficio_hora +
                ", total_ventas=" + total_ventas +
                ", total_costes=" + total_costes +
                ", total_beneficios=" + total_beneficios +
                ", proyecto=" + proyecto +
                ", servicio=" + servicio +
                '}';
    }
}
