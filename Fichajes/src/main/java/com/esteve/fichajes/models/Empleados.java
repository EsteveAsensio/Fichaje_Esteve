package com.esteve.fichajes.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table (name = "empleados")
public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "apellidos")
    private String apellidos;
    @Column (name = "direccion")
    private String direccion;
    @Column (name = "contacto")
    private Integer contacto;
    @Column (name = "correo")
    private String correo;
    @Column (name = "ruta_imagen")
    private String ruta_imagen;
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<Imputaciones> imputaciones;
    @OneToMany(mappedBy = "empleado_id", cascade = CascadeType.ALL)
    private List<Sugerencias> sugerencias;

    public Empleados(Integer id, String nombre, String apellidos, String direccion, Integer contacto, String correo, List<Imputaciones> imputaciones, String ruta_imagen, List<Sugerencias> sugerencias) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.contacto = contacto;
        this.correo = correo;
        this.imputaciones = imputaciones;
        this.ruta_imagen = ruta_imagen;
        this.sugerencias = sugerencias;
    }

    public Empleados() {

    }

    @Override
    public String toString() {
        return "Empleados{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", contacto=" + contacto +
                ", correo='" + correo + '\'' +
                '}';
    }
}
