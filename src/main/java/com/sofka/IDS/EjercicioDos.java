package com.sofka.IDS;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner cursor = new Scanner(System.in);
        cursor.nextLine();

        System.out.println("Digita un número:");
        int variableUno = Integer.parseInt(cursor.nextLine());
        System.out.println("Digita otro número:");
        int variableDos = Integer.parseInt(cursor.nextLine());
        if (variableUno < variableDos) {
            System.out.println(variableUno + " es menor que " + variableDos);
        }
        if (variableUno > variableDos) {
            System.out.println(variableUno + " es mayor que " + variableDos);
        }
        if (variableUno == variableDos) {
            System.out.println("Las variables son iguales");
        }
    }
}
