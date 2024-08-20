package com.esteve.fichajes.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "tipo")
    private String tipo;

    public Rol(Integer id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Rol() {

    }

    @Override
    public String toString() {
        return "Rol{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
