package com.sofka.IDS.EjercicioDiesiocho;

public class VideoJuego implements IEntregable{
    private String titulo;
    private int horasEstimadas = 10;
    public boolean entregado = false;
    private String genero;
    private String compania;

    public VideoJuego() {

    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.setTitulo(titulo);
        this.setHorasEstimadas(horasEstimadas);
    }

    public VideoJuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compania) {
        this.setTitulo(titulo);
        this.setHorasEstimadas(horasEstimadas);
        this.entregado = entregado;
        this.setGenero(genero);
        this.setCompania(compania);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
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
    public void compareTo(Object a) {
        VideoJuego b = (VideoJuego) a;
        if (this.horasEstimadas > b.horasEstimadas) {
            int diferencia = this.horasEstimadas - b.horasEstimadas;
            System.out.println(this.titulo + " tiene " + diferencia + " temporadas más que " + b.titulo);
        }
        if (this.horasEstimadas > b.horasEstimadas) {
            int diferencia = this.horasEstimadas - b.horasEstimadas;
            System.out.println(this.titulo + " tiene " + diferencia + " menos temporadas que " + b.titulo);
        }
        if (this.horasEstimadas == b.horasEstimadas) {
            System.out.println(this.titulo + " tienen la misma cantidad de temporadas con " + b.titulo + ": " + b.horasEstimadas);
        }
    }
}
