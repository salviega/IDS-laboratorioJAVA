package com.sofka.IDS.EjercicioDiesiocho;

public class Serie implements IEntregable{
    private String titulo;
    private int temporada = 3;
    public boolean entregado = false;
    private String genero;
    private String creador;

    public Serie() {

    }

    public Serie(String titulo, String creador) {
        this.setTitulo(titulo);
        this.setCreador(creador);
    }

    public Serie(String titulo, int temporada, String genero, String creador) {
        this.setTitulo(titulo);
        this.setTemporada(temporada);
        this.setGenero(genero);
        this.setCreador(creador);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", temporada=" + temporada +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public void compareTo(Object a) {
        Serie b = (Serie) a;
        if (this.temporada > b.temporada) {
            int diferencia = this.temporada - b.temporada;
            System.out.println(this.titulo + " tiene " + diferencia + " temporadas más que " + b.titulo);
        }
        if (this.temporada > b.temporada) {
            int diferencia = this.temporada - b.temporada;
            System.out.println(this.titulo + " tiene " + diferencia + " menos temporadas que " + b.titulo);
        }
        if (this.temporada == b.temporada) {
            System.out.println(this.titulo + " tienen la misma cantidad de temporadas con " + b.titulo + ": " + b.temporada);
        }
    }
}
