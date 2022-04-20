package com.sofka.IDS;

import java.util.*;

public class EjercicioCatorce {
    public static void main(String[] args) {
        System.out.println("Digita un número hasta el 1000: ");
        Scanner cursor = new Scanner(System.in);
        int numero = Integer.parseInt(cursor.nextLine());
        for (int i = numero; i<=1000; i = i + 2) {
            System.out.println(i);
        }
    }
}
