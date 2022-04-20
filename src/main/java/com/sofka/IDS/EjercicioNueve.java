package com.sofka.IDS;

public class EjercicioNueve {
    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String nuevaFrase = "";
        for (char letra: frase.toCharArray()) {
            if (letra == 'a') {
                letra = 'e';
                String nuevaLetra = Character.toString(letra);
                nuevaFrase = nuevaFrase.concat(nuevaLetra);
            }
            String nuevaLetra = Character.toString(letra);
            nuevaFrase = nuevaFrase.concat(nuevaLetra);
        }

        System.out.println(nuevaFrase + " odio las e");
    }
}
