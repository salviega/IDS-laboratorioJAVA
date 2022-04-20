package com.sofka.IDS;

import java.util.ArrayList;
import java.util.List;


public class EjercicioCinco {
    public static void main(String[] args) {
        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();
        int x = 0;
        while (x < 100) {
            if (x % 2 == 0) {
                pares.add(x);
            }
            if (x % 2 != 0) {
                impares.add(x);
            }
            x++;
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
