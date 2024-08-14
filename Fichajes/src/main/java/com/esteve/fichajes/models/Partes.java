package com.esteve.fichajes.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table (name = "partes")
public class Partes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="fecha")
    private Date fecha;
    @Column(name="nota")
    private String nota;
    @Column(name="ventas")
    private Float ventas;
    @Column(name="costes")
    private Float costes;
    @Column(name="beneficios")
    private Float beneficios;
    @Column(name="facturado")
    private Boolean facturado;
    @OneToMany(mappedBy = "parte", cascade = CascadeType.ALL)
    private List<Imputaciones> imputaciones;
    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyectos proyecto;

    public Partes() {

    }

    public Partes(Integer id, Proyectos proyecto, String nombre, Date fecha, String nota, Float ventas, Float costes, Float beneficios, Boolean facturado, List<Imputaciones> imputaciones) {
        this.id = id;
        this.proyecto = proyecto;
        this.nombre = nombre;
        this.fecha = fecha;
        this.nota = nota;
        this.ventas = ventas;
        this.costes = costes;
        this.beneficios = beneficios;
        this.facturado = facturado;
        this.imputaciones = imputaciones;
    }

    @Override
    public String toString() {
        return "Partes{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", nota='" + nota + '\'' +
                ", ventas=" + ventas +
                ", costes=" + costes +
                ", beneficios=" + beneficios +
                ", facturado=" + facturado +
                ", proyecto=" + proyecto +
                '}';
    }
}
