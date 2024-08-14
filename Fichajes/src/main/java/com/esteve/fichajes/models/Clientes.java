package com.esteve.fichajes.models;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="direccion")
    private String direccion;
    @Column(name="contacto")
    private Integer contacto;
    @Column(name="correo")
    private String correo;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Proyectos> proyectos;

    public Clientes() {

    }

    public Clientes(Integer id, String nombre, String direccion, Integer contacto, String correo, List<Proyectos> proyectos) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.correo = correo;
        this.proyectos = proyectos;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getContacto() {
        return contacto;
    }

    public void setContacto(Integer contacto) {
        this.contacto = contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Proyectos> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyectos> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", contacto=" + contacto +
                ", correo='" + correo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clientes clientes = (Clientes) o;
        return Objects.equals(id, clientes.id) && Objects.equals(nombre, clientes.nombre) && Objects.equals(direccion, clientes.direccion) && Objects.equals(contacto, clientes.contacto) && Objects.equals(correo, clientes.correo) && Objects.equals(proyectos, clientes.proyectos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, direccion, contacto, correo, proyectos);
    }
}
