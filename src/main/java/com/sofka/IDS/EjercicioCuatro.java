package com.sofka.IDS;

import java.util.Scanner;

public class EjercicioCuatro {
    public static float obtenerPrecio(float valor) {
        float IVA = (float) 0.21;
        float precioCompleto = valor + (valor * IVA);
        System.out.println("El precio del producto es: " + precioCompleto);
        return precioCompleto;
    }
    public static void main(String[] args) {
        System.out.println("Digita el precio de un producto: ");
        Scanner cursor = new Scanner(System.in);
        obtenerPrecio(Float.parseFloat(cursor.nextLine()));


    }
}
