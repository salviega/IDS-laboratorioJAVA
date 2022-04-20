package com.sofka.IDS;

import java.util.ArrayList;
import java.util.List;

public class EjercicioSeis {
    public static void main(String[] args) {
        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            }
            if (1 % 2 != 0) {
                impares.add(i);
            }
        }
        System.out.println("Los números pares del 1 al 100 son estos: ");
        for (int par: pares) {
            System.out.println(par);
        }
        System.out.println("Los números impares del 1 al 100 son estos: ");
        for (int impar: impares) {
            System.out.println(impar);
        }
    }
}
