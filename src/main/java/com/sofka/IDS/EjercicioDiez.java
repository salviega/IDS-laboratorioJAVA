package com.sofka.IDS;

import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        Scanner cursor = new Scanner(System.in);
        String frase = cursor.nextLine();
        String nuevaFrase = "";
        for (char letra: frase.toCharArray()) {
            if (letra == ' ') {
                continue;
            }
            String nuevaLetra = Character.toString(letra);
            nuevaFrase = nuevaFrase.concat(nuevaLetra);
        }

        System.out.println(nuevaFrase);
    }
}
