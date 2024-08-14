package com.esteve.fichajes.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table (name = "imputaciones")
public class Imputaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="horas")
    private Float horas;
    @Column(name="fecha_entrada")
    private LocalDateTime fecha_entrada;
    @Column(name="fecha_salida")
    private LocalDateTime fecha_salida;
    @Column(name="nota")
    private String nota;
    @Column(name="ventas")
    private Float ventas;
    @Column(name="costes")
    private Float costes;
    @Column(name="beneficios")
    private Float beneficios;

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyectos proyecto;
    @ManyToOne
    @JoinColumn(name = "tarea_id")
    private Tareas tarea;
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleados empleado;
    @ManyToOne
    @JoinColumn(name = "parte_id")
    private Partes parte;

    public Imputaciones(Partes parte, Empleados empleado, Proyectos proyecto, Tareas tarea, Float beneficios, Float costes, Float ventas, String nota, LocalDateTime fecha_salida, LocalDateTime fecha_entrada, Float horas, Integer id) {
        this.parte = parte;
        this.empleado = empleado;
        this.proyecto = proyecto;
        this.tarea = tarea;
        this.beneficios = beneficios;
        this.costes = costes;
        this.ventas = ventas;
        this.nota = nota;
        this.fecha_salida = fecha_salida;
        this.fecha_entrada = fecha_entrada;
        this.horas = horas;
        this.id = id;
    }
    public Imputaciones() {

    }

    @Override
    public String toString() {
        return "Imputaciones{" +
                "id=" + id +
                ", horas=" + horas +
                ", fecha_entrada=" + fecha_entrada +
                ", fecha_salida=" + fecha_salida +
                ", nota='" + nota + '\'' +
                ", ventas=" + ventas +
                ", costes=" + costes +
                ", beneficios=" + beneficios +
                ", proyecto=" + proyecto +
                ", empleado=" + empleado +
                '}';
    }
}
