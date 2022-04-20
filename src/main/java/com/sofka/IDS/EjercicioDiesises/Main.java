package com.sofka.IDS.EjercicioDiesises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cursor = new Scanner(System.in);
        System.out.println("Ingresa nombre: ");
        String nombre = cursor.nextLine();
        System.out.println("Ingresa edad: ");
        int edad = Integer.parseInt(cursor.nextLine());
        System.out.println("Ingresa sexo (H para hombre y M para mujer): ");
        char sexo = cursor.nextLine().charAt(0);
        Persona personaUno = new Persona(nombre, edad, sexo);
        Persona personadDos = new Persona();
        Persona personaTres = new Persona();
        personaTres.setNombre("Santiago");
        personaTres.setEdad(25);
        personaTres.setEdad('H');
        personaTres.setPeso((float) 65.5);
        personaTres.setAltura((float) 1.8);
        System.out.println(personaUno.calcularIMC());
        System.out.println(personaUno.esMayorDeEdad());
        System.out.println(personaUno.toString());
        System.out.println(personadDos.calcularIMC());
        System.out.println(personadDos.esMayorDeEdad());
        System.out.println(personadDos.toString());
        System.out.println(personaTres.calcularIMC());
        System.out.println(personaTres.esMayorDeEdad());
        System.out.println(personaTres.toString());
    }
}
