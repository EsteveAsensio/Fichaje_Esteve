package com.esteve.fichajes.models;

import java.sql.Date;

public class Imputaciones {

    private Integer id;
    private Float horas;
    private Date fecha;

    public Imputaciones(Integer id, Float horas, Date fecha) {
        this.id = id;
        this.horas = horas;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getHoras() {
        return horas;
    }

    public void setHoras(Float horas) {
        this.horas = horas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
