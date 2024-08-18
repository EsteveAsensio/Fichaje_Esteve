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
@Table (name = "sugerencias")
public class Sugerencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="asunto")
    private String asunto;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="importante")
    private Boolean importante;
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleados empleado_id;

    public Sugerencias(Integer id, String asunto, String descripcion, Boolean importante, Empleados empleado_id) {
        this.id = id;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.importante = importante;
        this.empleado_id = empleado_id;
    }

    public Sugerencias() {

    }

    @Override
    public String toString() {
        return "Sugerencias{" +
                "id=" + id +
                ", asunto='" + asunto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", importante=" + importante +
                ", empleado_id=" + empleado_id +
                '}';
    }
}
