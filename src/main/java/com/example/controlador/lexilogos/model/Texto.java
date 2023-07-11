package com.example.controlador.lexilogos.model;

import java.util.Objects;

public class Texto {
    private int Id;
    private String titulo;
    private String cuerpo;

    @Override
    public String toString() {
        return "Texto{" +
                "Id=" + Id +
                ", titulo='" + titulo + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Texto texto)) return false;
        return Id == texto.Id && Objects.equals(titulo, texto.titulo) && Objects.equals(cuerpo, texto.cuerpo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, titulo, cuerpo);
    }

    public Texto(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }
    public Texto(int id,String titulo, String cuerpo) {
        this.Id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public String getFullTexto() {
        return titulo + " " + cuerpo;
    }

    public int getId() {
        return Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }
}
