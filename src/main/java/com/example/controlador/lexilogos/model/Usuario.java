package com.example.controlador.lexilogos.model;

import java.util.Objects;

public class Usuario {
    private int id;
    private String nombre;
    private String contra;

    public Usuario(int id, String nombre, String contra) {
        this.id = id;
        this.nombre = nombre;
        this.contra = contra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return id == usuario.id && Objects.equals(nombre, usuario.nombre) && Objects.equals(contra, usuario.contra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, contra);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", contra='" + contra + '\'' +
                '}';
    }
}
