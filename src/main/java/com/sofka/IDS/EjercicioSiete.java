package com.sofka.IDS;

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner cursor = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Digita un número");
            numero = Integer.parseInt(cursor.nextLine());
        } while (numero > 0);
    }
}
