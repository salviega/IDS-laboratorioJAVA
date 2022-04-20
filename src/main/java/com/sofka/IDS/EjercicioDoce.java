package com.sofka.IDS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioDoce {
    public static void main(String[] args) {
        System.out.println("Por favor digita una frase: ");
        Scanner cursor = new Scanner(System.in);
        String palabraUno = cursor.nextLine();
        System.out.println("Por favor digita otra frase: ");
        String palabraDos = cursor.nextLine();
        List<Character> letrasInexistentesUno = new ArrayList<Character>();
        List<Character> letrasInexistentesdDos = new ArrayList<Character>();
        for (char letra: palabraUno.toCharArray()) {
            List<Character> letrasRepetidas = new ArrayList<Character>();
            for (char letrica: palabraDos.toCharArray()) {
                if (letra != letrica) {
                    letrasRepetidas.add(letra);
                }
            }
            if (palabraDos.length() == letrasRepetidas.size()) {
                letrasInexistentesUno.add(letrasRepetidas.get(0));
            }
        }
        for (char letra: palabraDos.toCharArray()) {
            List<Character> letrasRepetidas = new ArrayList<Character>();
            for (char letrica: palabraUno.toCharArray()) {
                if (letra != letrica) {
                    letrasRepetidas.add(letra);
                }
            }
            if (palabraUno.length() == letrasRepetidas.size()) {
                letrasInexistentesdDos.add(letrasRepetidas.get(0));
            }
        }
        if (letrasInexistentesUno.size() == 0) {
            System.out.println("Las palabras uno " + palabraUno + " y palabra dos " + palabraDos + " son iguales");
        } else {
            System.out.println("La palabra " + palabraUno + " no tiene las siguientes letras de la palabra " + palabraDos + " " + letrasInexistentesdDos + "\n"
            + " y la palabra " + palabraDos + " no tiene las siguientes letras de la palabra " + palabraUno + " " + letrasInexistentesUno);
        }
    }
}
