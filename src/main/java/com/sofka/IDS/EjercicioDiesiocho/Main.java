package com.sofka.IDS.EjercicioDiesiocho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Serie> serieList = new ArrayList<Serie>();
        serieList.indexOf(5);
        Serie serieUno = new Serie("Dexter", "Dexter");
        serieUno.setTemporada(30);
        serieList.add(serieUno);
        Serie serieDos = new Serie("Doctor Casas", "Juanita");
        serieList.add(serieDos);
        Serie serieTres = new Serie("Metástasis", "Anita");
        serieList.add(serieTres);
        Serie serieUCuatro= new Serie("Vecinos", "Mary");
        serieList.add(serieUCuatro);
        Serie serieCinco = new Serie("Ella", "Mario");
        serieList.add(serieCinco);
        List<VideoJuego> videoJuegosList = new ArrayList<VideoJuego>();
        videoJuegosList.indexOf(5);
        VideoJuego juegoUno = new VideoJuego("Uno", 10);
        videoJuegosList.add(juegoUno);
        VideoJuego juegoDos = new VideoJuego("Dos", 8);
        videoJuegosList.add(juegoDos);
        VideoJuego juegoTres = new VideoJuego("Tres", 20);
        videoJuegosList.add(juegoTres);
        VideoJuego juegoCuatro = new VideoJuego("Cuatro", 1);
        videoJuegosList.add(juegoCuatro);
        VideoJuego juegoCinco = new VideoJuego("CXX", 8);
        videoJuegosList.add(juegoCinco);
        videoJuegosList.get(1).entregar();
        videoJuegosList.get(3).entregar();
        serieList.get(2).entregar();
        serieList.get(0).entregar();
        int numero = 0;
        for (Serie serie : serieList) {
            if (serie.entregado == true) {
                System.out.println("la serie " + serie.getTitulo() + " fue entregado");
                numero += 1;
            }
        }
        System.out.println("Fueron entregas " + numero + " series");
        numero = 0;
        for (VideoJuego videoJuego : videoJuegosList) {
            if (videoJuego.entregado == true) {
                System.out.println("el videojuego" + videoJuego.getTitulo() + " fue entregado");
                numero += 1;
            }
        }
        System.out.println("Fueron entregas " + numero + " videojuegos");

        Serie serieMayor = serieList.stream()
                .max(Comparator.comparingInt(Serie::getTemporada))
                .get();

        System.out.println("La serie con el mayor número de temporadas es: " + serieMayor.getTitulo() + " con " + serieMayor.getTemporada());

        VideoJuego juegoMayor = videoJuegosList.stream()
                .max(Comparator.comparingInt(VideoJuego::getHorasEstimadas))
                .get();

        System.out.println("El juego con el mayor número de horas es: " + juegoMayor.getTitulo() + " con " + juegoMayor.getHorasEstimadas());
    }
}
