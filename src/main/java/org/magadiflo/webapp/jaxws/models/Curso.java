package org.magadiflo.webapp.jaxws.models;

public class Curso {

    private String nombre;

    public Curso() {
    }

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
