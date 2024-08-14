package com.esteve.fichajes.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

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

    public Proyectos(Integer id, String nombre, Date fecha, String descripcion, Float tiempo_estimado, Float tiempo_restante, Float tiempo_imputado, Estado estado, Clientes cliente) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tiempo_estimado = tiempo_estimado;
        this.tiempo_restante = tiempo_restante;
        this.tiempo_imputado = tiempo_imputado;
        this.estado = estado;
        this.cliente = cliente;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getTiempo_estimado() {
        return tiempo_estimado;
    }

    public void setTiempo_estimado(Float tiempo_estimado) {
        this.tiempo_estimado = tiempo_estimado;
    }

    public Float getTiempo_restante() {
        return tiempo_restante;
    }

    public void setTiempo_restante(Float tiempo_restante) {
        this.tiempo_restante = tiempo_restante;
    }

    public Float getTiempo_imputado() {
        return tiempo_imputado;
    }

    public void setTiempo_imputado(Float tiempo_imputado) {
        this.tiempo_imputado = tiempo_imputado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proyectos proyectos = (Proyectos) o;
        return Objects.equals(id, proyectos.id) && Objects.equals(nombre, proyectos.nombre) && Objects.equals(fecha, proyectos.fecha) && Objects.equals(descripcion, proyectos.descripcion) && Objects.equals(tiempo_estimado, proyectos.tiempo_estimado) && Objects.equals(tiempo_restante, proyectos.tiempo_restante) && Objects.equals(tiempo_imputado, proyectos.tiempo_imputado) && estado == proyectos.estado && Objects.equals(cliente, proyectos.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, fecha, descripcion, tiempo_estimado, tiempo_restante, tiempo_imputado, estado, cliente);
    }
}
