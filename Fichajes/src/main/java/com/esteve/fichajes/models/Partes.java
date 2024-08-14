package com.esteve.fichajes.models;

import java.sql.Date;

public class Partes {

    private Integer id;
    private String nombre;
    private Date fecha;
    private String nota;
    private Float ventas;
    private Float costes;
    private Float beneficios;

    public Partes(Integer id, String nombre, Date fecha, Float ventas, String nota, Float costes, Float beneficios) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.ventas = ventas;
        this.nota = nota;
        this.costes = costes;
        this.beneficios = beneficios;
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

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Float getVentas() {
        return ventas;
    }

    public void setVentas(Float ventas) {
        this.ventas = ventas;
    }

    public Float getCostes() {
        return costes;
    }

    public void setCostes(Float costes) {
        this.costes = costes;
    }

    public Float getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(Float beneficios) {
        this.beneficios = beneficios;
    }
}
