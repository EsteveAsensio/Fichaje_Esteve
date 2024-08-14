package com.esteve.fichajes.models;

public class Servicios {

    private Integer id;
    private String nombre;
    private String descripcion;
    private Float precio_hora;
    private Float coste_hora;

    public Servicios(Integer id, String nombre, String descripcion, Float precio_hora, Float coste_hora) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_hora = precio_hora;
        this.coste_hora = coste_hora;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getCoste_hora() {
        return coste_hora;
    }

    public void setCoste_hora(Float coste_hora) {
        this.coste_hora = coste_hora;
    }
}
