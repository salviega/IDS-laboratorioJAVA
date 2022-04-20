package com.sofka.IDS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioOnce {
    public static void tranformarFrase(String frase) {
        List<Character> letras = new ArrayList<Character>();
        for (char letra : frase.toCharArray()) {
            if (letra != ' ') {
                letras.add(letra);
            }
        }
        List<Character> vocales = new ArrayList<Character>();
        for (char letra : frase.toCharArray()) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println(letra);
                vocales.add(letra);
            }
        }
        int numeroLetras = letras.size();
        int numeroVocales = vocales.size();
        System.out.println("El número de letras es: " + numeroLetras + " y el número de vocales es: " + numeroVocales);
    }
    public static void main(String[] args) {
        System.out.println("Escribe una frase: ");
        Scanner cursor = new Scanner(System.in);
        String frase = cursor.nextLine();
        tranformarFrase(frase);
    }
}
