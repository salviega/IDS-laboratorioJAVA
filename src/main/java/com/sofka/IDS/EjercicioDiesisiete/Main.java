package com.sofka.IDS.EjercicioDiesisiete;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticoList = new ArrayList<Electrodomestico>();
        electrodomesticoList.indexOf(10);
        Lavadora lavadoraUno = new Lavadora(15, 15);
        electrodomesticoList.add(lavadoraUno);
        Lavadora lavadoraDos = new Lavadora();
        electrodomesticoList.add(lavadoraDos);
        Lavadora lavadoraTres = new Lavadora();
        electrodomesticoList.add(lavadoraTres);
        Lavadora lavadoraCuatro = new Lavadora(24, 60);
        electrodomesticoList.add(lavadoraCuatro);
        Television televisionUno = new Television(500,60);
        televisionUno.setConsumoEnergetico('F');
        electrodomesticoList.add(televisionUno);
        Television televisionDos = new Television(450,60);
        electrodomesticoList.add(televisionDos);
        Television televisionTres = new Television();
        electrodomesticoList.add(televisionTres);
        Television televisionCuatro = new Television();
        electrodomesticoList.add(televisionCuatro);
        Lavadora lavadoraCinco = new Lavadora(20);
        electrodomesticoList.add(lavadoraCinco);
        Television televisionCinco = new Television(50, false);
        electrodomesticoList.add(televisionCinco);
        List<Integer> facturaTelevision = new ArrayList<Integer>();
        List<Integer> facturaLavadora = new ArrayList<Integer>();
        for (Electrodomestico electrodomestico : electrodomesticoList) {
            if (electrodomestico instanceof Television) {
                electrodomestico.precioFinal();
                facturaTelevision.add(electrodomestico.getPrecioBase());
            }
            if (electrodomestico instanceof  Lavadora) {
                electrodomestico.precioFinal();
                facturaLavadora.add((electrodomestico.getPrecioBase()));
            }
        }

        System.out.println("El precio de los televisores son :" + facturaTelevision);
        System.out.println("El precio de las lavadoras son :" + facturaLavadora);
        facturaLavadora.addAll(facturaTelevision);
        int resultado = 0;
        for (int i = 0; i < facturaLavadora.toArray().length; i++) {
            resultado += (int) facturaLavadora.toArray()[i];
        }
        System.out.println("El precio de los electromdomesticos son :" + facturaLavadora + " = $" + resultado );
    }
}
