package com.esteve.fichajes.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "proyectos")
public class Proyectos {

    public enum Estado {  // Enum
        PLANEADO,
        EN_PROGRESO,
        COMPLETADO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="fecha")
    private Date fecha;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="tiempo_estimado")
    private Float tiempo_estimado;
    @Column(name="tiempo_restante")
    private Float tiempo_restante;
    @Column(name="tiempo_imputado")
    private Float tiempo_imputado;
    @Column(name="estado")
    private Estado estado;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes cliente;
    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL)
    private List<Tareas> tareas;

    public Proyectos() {
    }

    public Proyectos(Integer id, String nombre, Date fecha, String descripcion, Float tiempo_estimado, Estado estado, Clientes cliente) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tiempo_estimado = tiempo_estimado;
        this.estado = estado;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Proyectos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", tiempo_estimado=" + tiempo_estimado +
                ", tiempo_restante=" + tiempo_restante +
                ", tiempo_imputado=" + tiempo_imputado +
                ", estado=" + estado +
                ", cliente=" + cliente +
                '}';
    }
}
